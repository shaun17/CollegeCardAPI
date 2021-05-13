package com.college.card.service;

import com.college.card.po.User;

import java.util.List;

public interface UserService {

     List<User> queryByExample(String username);
     List<User> queryByUserName(String username);

}
