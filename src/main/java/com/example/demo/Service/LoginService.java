package com.example.demo.Service;

import com.example.demo.domain.File;
import com.example.demo.domain.User;

public interface LoginService {
    int loginUser(String username,String userpwd);
    User findUserByUsername(String username);
    File findFileByUserId(int id);
}
