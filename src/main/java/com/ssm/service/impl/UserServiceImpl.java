package com.ssm.service.impl;

import com.ssm.dao.IUserMapper;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper iUserMapper;


    @Override
    public String login() {
        System.out.println("This is UserServiceImpl");

        List<User> users = iUserMapper.getUserList();

        for (User user : users){
            System.out.println(user.toString());
        }


        return "hello World！";
    }
}
