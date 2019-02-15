package com.impl;

import com.entity.User;

public interface UserMapper {
    public User getUser(int id);
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(int id);
}
