package com.zosh.ecommerce.multivendor.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException extends RuntimeException{

    private String message;
    private HttpStatus httpStatus;
}
