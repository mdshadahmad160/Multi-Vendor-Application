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
public class CartProductId  implements Serializable {

    @Column(name = "cart_id")
    private long cartId;

    @Column(name = "seller_id")
    private long sellerId;

    @Column(name = "product_id")
    private long productId;
}
