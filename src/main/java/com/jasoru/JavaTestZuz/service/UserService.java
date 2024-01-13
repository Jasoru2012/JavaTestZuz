package com.jasoru.JavaTestZuz.service;

import com.jasoru.JavaTestZuz.repo.UsersRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {
    private final UsersRepo UsersRepo;

    public UserService(UsersRepo UsersRepo) {
        this.UsersRepo = UsersRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String user_name) throws UsernameNotFoundException {
        return UsersRepo.findByUsername(user_name);
    }
}
