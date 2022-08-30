package com.example.secutirydemo;

import com.example.secutirydemo.domain.AppRole;
import com.example.secutirydemo.domain.AppUser;
import com.example.secutirydemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SecutirydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecutirydemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return arg -> {
          userService.saveRole(new AppRole(null, "ROLE_USER"));
          userService.saveRole(new AppRole(null, "ROLE_MANAGER"));
          userService.saveRole(new AppRole(null, "ROLE_ADMIN"));
          userService.saveRole(new AppRole(null, "ROLE_SUPER_ADMIN"));

          userService.saveUser(new AppUser(null, "JOHN", "jooohhnnn", "1234", new ArrayList<>()));
          userService.saveUser(new AppUser(null, "matt", "matt", "pass", new ArrayList<>()));
          userService.saveUser(new AppUser(null, "mark", "marks", "1234", new ArrayList<>()));
          userService.saveUser(new AppUser(null, "annie", "anniefrog", "1234", new ArrayList<>()));

          userService.addRoleToUser("jooohhnnn", "ROLE_USER");
          userService.addRoleToUser("matt", "ROLE_SUPER_ADMIN");
          userService.addRoleToUser("anniefrog", "ROLE_ADMIN");
          userService.addRoleToUser("marks", "ROLE_MANAGER");
        };
    }
}
