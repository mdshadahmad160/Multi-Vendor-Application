package com.zosh.ecommerce.multivendor.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartProductDto {

    @NotNull
    private Long sellerId;
    @NotNull
    private Long productId;
    @NotNull
    @Min(1)
    private int quantity;
}
