package com.example.demo.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("File")
public class File implements Serializable {
    private int id;
    private String fileName;
    private int uid;

    public File() {
    }

    public File(String fileName, int uid) {
        this.fileName = fileName;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", uid=" + uid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
