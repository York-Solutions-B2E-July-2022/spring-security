package com.example.secutirydemo.service;

import com.example.secutirydemo.domain.AppRole;
import com.example.secutirydemo.domain.AppUser;

import java.util.List;

public interface UserService {
    AppUser saveUser(AppUser user);
    AppRole saveRole(AppRole user);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser> getUsers();
}
