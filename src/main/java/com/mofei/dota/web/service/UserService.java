package com.mofei.dota.web.service;

import com.mofei.dota.web.entity.User;

import java.util.List;


public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
