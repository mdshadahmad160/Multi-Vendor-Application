package com.zosh.ecommerce.multivendor.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    @NotBlank
    private String name;
    @NotNull
    private Long categoryId;
}
