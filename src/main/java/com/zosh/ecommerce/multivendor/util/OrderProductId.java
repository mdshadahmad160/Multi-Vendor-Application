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
public class OrderProductId implements Serializable {


    @Column(name = "order_id")
    private long orderId;

    @Column(name = "seller_id")
    private long sellerId;

    @Column(name = "product_id")
    private long productId;
}
