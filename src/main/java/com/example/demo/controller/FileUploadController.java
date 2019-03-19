package com.example.demo.controller;

import com.example.demo.domain.MyForm;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {


    @PostMapping("/upload")
    public String handleFormUpload(MyForm form) {
        if (!form.getFile().isEmpty()) {

            String fileName = form.getName();
            if ("".equals(fileName) || fileName == null)
                fileName = form.getFile().getOriginalFilename();


            try (FileOutputStream fos = new FileOutputStream(new File("/home/yan/file/" + fileName))) {
                byte[] bytes = form.getFile().getBytes();

                //   System.out.println(fileName + "===================" + bytes.length);
                fos.write(bytes);
                fos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "redirect:uploadSuccess";
        }
        return "redirect:uploadFailure";
    }


    @RequestMapping(value = "/download", produces = "application/octet-stream;charset=UTF-8")
    public ResponseEntity<byte[]> download() throws IOException {
//                指定文件,必须是绝对路径
        File file = new File("/home/yan/file/1.png");
//                下载浏览器响应的那个文件名
        String dfileName = "1.png";
//                下面开始设置HttpHeaders,使得浏览器响应下载
        HttpHeaders headers = new HttpHeaders();
//                设置响应方式
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//                设置响应文件
        headers.setContentDispositionFormData("attachment", dfileName);
//                把文件以二进制形式写回
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }


}