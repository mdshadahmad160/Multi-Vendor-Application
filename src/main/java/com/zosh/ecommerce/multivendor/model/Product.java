package com.zosh.ecommerce.multivendor.model;

import lombok.*;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

/**
 * @author Shad Ahmad
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private String name;
    private String description;
    private Double price;
    private Integer inStock;
    private String imageUrl;
    @ManyToMany(fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<Category> categories;
    @OneToMany
    @JoinColumn(name = "productId")
    @BatchSize(size = 50)
    private List<ProductReview> reviews;

}
