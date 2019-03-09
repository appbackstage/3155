package com.example.demo.Service;

import com.example.demo.domain.File;
import com.example.demo.domain.User;

import java.util.List;

public interface LoginService {
    int loginUser(String username, String userpwd);

    User findUserByUsername(String username);

    List<File> findFileByUserId(int id);

    int updateStateByUsername(String username);
}
