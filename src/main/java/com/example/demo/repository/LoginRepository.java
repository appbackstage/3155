package com.example.demo.repository;

import com.example.demo.domain.File;
import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginRepository {
   int loginUser(@Param("username") String username,@Param("userpwd") String userpwd);
   User findUserByUsername( String username);
   File findFileByUserId(int id);
}
