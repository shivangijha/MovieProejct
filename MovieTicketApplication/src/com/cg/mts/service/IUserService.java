package com.cg.mts.service;

import com.cg.mts.entities.User;

public interface IUserService {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
