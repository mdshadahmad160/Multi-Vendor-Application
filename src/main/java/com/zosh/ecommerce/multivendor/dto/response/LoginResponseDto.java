package com.zosh.ecommerce.multivendor.dto.response;

import com.zosh.ecommerce.multivendor.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDto {

    private User user;
    private String accessToken;
    private String refreshToken;
}
