package com.zosh.ecommerce.multivendor.service;


import com.zosh.ecommerce.multivendor.dto.request.UpdateUserDto;
import com.zosh.ecommerce.multivendor.dto.request.UpdateUserEmailDto;
import com.zosh.ecommerce.multivendor.dto.request.UpdateUserUsernameDto;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {


    List<User> getAll();

    User getById(long id);

    User getByEmail(String email);

    User getByEmailOrNull(String email);

    User getByUsername(String username);

    User getByUsernameOrNull(String username);

    User save(User user);

    User update(User authenticatedUser, UpdateUserDto updateUserDto);

    User updateEmail(User authenticatedUser, UpdateUserEmailDto updateUserEmailDto);

    User updateUsername(User authenticatedUser, UpdateUserUsernameDto updateUserUsernameDto);

}
