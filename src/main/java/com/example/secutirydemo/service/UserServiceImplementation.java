package com.example.secutirydemo.service;

import com.example.secutirydemo.domain.AppRole;
import com.example.secutirydemo.domain.AppUser;
import com.example.secutirydemo.repo.RoleRepo;
import com.example.secutirydemo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public AppUser saveUser(AppUser user) {
        log.info("saving new user: {}", user.getName());
        return userRepo.save(user);
    }

    @Override
    public AppRole saveRole(AppRole role) {
        log.info("saving new role: {}", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("adding role to user: {}, {}", roleName,username);
        AppUser user = userRepo.findByUsername(username);
        AppRole role = roleRepo.findByName(roleName);
        user.
                getRole().
                add(role);
    }

    @Override
    public AppUser getUser(String username) {
        log.info("Fetching user {}",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
