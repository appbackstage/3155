package com.example.demo.config;


import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.MultipartConfigElement;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver simpleMappingExceptionResolver
                = new SimpleMappingExceptionResolver();
        Properties props = new Properties();
        props.setProperty("java.lang.RuntimeException", "error");
        props.setProperty("java.lang.NullPointerException", "null");
        simpleMappingExceptionResolver.setExceptionMappings(props);
        return simpleMappingExceptionResolver;
    }

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
        List<MediaType> mediaTypeList = new ArrayList<>();
        mediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
        stringHttpMessageConverter.setSupportedMediaTypes(mediaTypeList);
        return stringHttpMessageConverter;
    }

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        return  new MultipartConfigElement("/tmp", 20797152, 4194303, 0);
    }





}
