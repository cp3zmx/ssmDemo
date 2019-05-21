package com.ays.service.impl;

import com.ays.dao.UserMapper;
import com.ays.model.User;
import com.ays.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String jobNo) {
        return 0;
    }
}