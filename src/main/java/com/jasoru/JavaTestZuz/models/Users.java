package com.jasoru.JavaTestZuz.models;

import com.jasoru.JavaTestZuz.controllers.UsersController;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users extends User implements UserDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "user_age")
    private int user_age;
    @Column(name = "user_pass")
    private String user_pass;

    public Users(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities, Long user_id, String user_name, int user_age, String user_pass) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_age = user_age;
        this.user_pass = user_pass;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public void setActive(boolean b) {
    }

    public void setRoles(Set<Roles> singleton) {
    }
}
