package com.jasoru.JavaTestZuz.controllers;

import com.jasoru.JavaTestZuz.models.Roles;
import com.jasoru.JavaTestZuz.models.Users;
import com.jasoru.JavaTestZuz.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

public class SingupController {

    @Controller
    public class RegistrationController {
        @Autowired
        private UsersRepo UsersRepo;

        @GetMapping("/registration")
        public String registration() {
            return "registration";
        }

        @PostMapping("/registration")
        public String addUser(Users user, Map<String, Object> model) {
            User userFromDb = (User) UsersRepo.findByUsername(user.getUsername());

            if (userFromDb != null) {
                model.put("message", "User exists!");
                return "registration";
            }

            user.setActive(true);
            user.setRoles(Collections.singleton(Roles.USER));
            UsersRepo.save(user);

            return "redirect:/login";
        }

    }
}