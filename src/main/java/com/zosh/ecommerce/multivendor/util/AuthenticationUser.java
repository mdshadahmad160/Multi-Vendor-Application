package com.zosh.ecommerce.multivendor.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

public class AuthenticationUser {

    private static Authentication authentication;

    public static User get(Authentication authentication) {
        return ((CustomUser) authentication.getPrincipal()).getUser();
    }
}
