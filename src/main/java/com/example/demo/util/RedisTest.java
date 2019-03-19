package com.example.demo.util;

import org.apache.ibatis.cache.Cache;
import org.mybatis.caches.redis.SerializeUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RedisTest implements Cache {

        private Jedis redisClient = createClient();
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private String id;

    public RedisTest(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("Cache instances require an ID");
        }
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        return Integer.valueOf(redisClient.dbSize().toString());
    }

    @Override
    public void putObject(Object key, Object value) {

        redisClient.set(SerializeUtil.serialize(key.toString()), SerializeUtil.serialize(value));
    }

    @Override
    public Object getObject(Object key) {
        Object value = SerializeUtil.unserialize(redisClient.get(SerializeUtil.serialize(key.toString())));
        return value;
    }

    @Override
    public Object removeObject(Object key) {
        return redisClient.expire(SerializeUtil.serialize(key.toString()), 0);
    }

    @Override
    public void clear() {
        redisClient.flushDB();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }

    protected static Jedis createClient() {
        try {
            JedisPool pool = new JedisPool(new JedisPoolConfig(), "127.0.0.1");
            return pool.getResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("connect failed");
    }

}