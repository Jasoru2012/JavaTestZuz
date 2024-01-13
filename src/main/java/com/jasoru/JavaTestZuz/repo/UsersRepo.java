package com.jasoru.JavaTestZuz.repo;

import com.jasoru.JavaTestZuz.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsersRepo extends CrudRepository<Users, Long> {
    UserDetails findByUsername(String userName);
}
