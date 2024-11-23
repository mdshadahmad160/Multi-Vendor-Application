package com.zosh.ecommerce.multivendor.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenRequestDto {

    @NotBlank(message = "refreshToken is required")
    private String refreshToken;
}
