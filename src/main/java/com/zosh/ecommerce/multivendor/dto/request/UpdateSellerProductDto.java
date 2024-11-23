package com.zosh.ecommerce.multivendor.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSellerProductDto {

    @NotNull
    @Min(1)
    private Double price;
}
