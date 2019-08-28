package com.ssm.dao;

import com.ssm.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserMapper {
    public List<User> getUserList();
}
