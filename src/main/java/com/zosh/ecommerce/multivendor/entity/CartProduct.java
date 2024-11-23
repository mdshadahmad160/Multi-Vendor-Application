package com.zosh.ecommerce.multivendor.entity;

import com.zosh.ecommerce.multivendor.util.CartProductId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart_product")
public class CartProduct {
    @EmbeddedId
    private CartProductId cartProductId;

    @ManyToOne
    @MapsId("cartId")
    private Cart cart;

    @ManyToOne
    @MapsId("sellerId")
    private User seller;

    @ManyToOne
    @MapsId("productId")
    private Product product;

    @Column(nullable = false)
    private int quantity;
}
