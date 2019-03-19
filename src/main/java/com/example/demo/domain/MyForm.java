package com.example.demo.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class MyForm implements Serializable
{
    private String name;
    private MultipartFile file;

    public MyForm(String name, MultipartFile file) {
        this.name = name;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}