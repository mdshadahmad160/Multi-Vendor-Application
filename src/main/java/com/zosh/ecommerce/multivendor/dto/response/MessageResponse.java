package com.zosh.ecommerce.multivendor.dto.response;

public class MessageResponse {
    private final String message;

    public MessageResponse(String message) {
        this.message = message;

    }

    public String getMessage() {
        return message;
    }
}
