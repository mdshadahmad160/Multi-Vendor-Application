package com.zosh.ecommerce.multivendor.entity;

import com.zosh.ecommerce.multivendor.util.SellerProductId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "`seller_product`")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellerProduct implements Serializable {
    @EmbeddedId
    private SellerProductId sellerProductId;

    @ManyToOne
    @MapsId("sellerId")
    private User seller;

    @ManyToOne
    @MapsId("productId")
    private Product product;

    @Column(nullable = false)
    private double price;
}
