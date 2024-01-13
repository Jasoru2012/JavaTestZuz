package com.jasoru.JavaTestZuz.models;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
