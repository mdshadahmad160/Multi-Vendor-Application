package com.zosh.ecommerce.multivendor.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerProductId implements Serializable {

    @Column(name = "seller_id", nullable = false)
    private long sellerId;

    @Column(name = "product_id", nullable = false)
    private long productId;
}
