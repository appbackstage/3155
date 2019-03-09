package com.example.demo.Service.impl;

import com.example.demo.Service.LoginService;
import com.example.demo.domain.File;
import com.example.demo.domain.User;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;


    @Override
    public int loginUser(String username, String userpwd) {
        if (username != null && userpwd != null) {

            return loginRepository.loginUser(username, userpwd);


        }
        return 0;
    }

    @Override
    public User findUserByUsername(String username) {
        if (username != null) {

            return loginRepository.findUserByUsername(username);
        }

        return null;
    }

    @Override
    public List<File> findFileByUserId(int id) {
        return loginRepository.findFileByUserId(id);
    }

    @Override
    public int updateStateByUsername(String username) {
        return loginRepository.updateStateByUsername(username);
    }
}
