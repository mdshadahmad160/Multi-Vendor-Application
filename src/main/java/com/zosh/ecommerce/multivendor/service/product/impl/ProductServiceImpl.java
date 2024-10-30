package com.zosh.ecommerce.multivendor.service.product.impl;

import com.zosh.ecommerce.multivendor.model.Product;
import com.zosh.ecommerce.multivendor.repository.ProductRepository;
import com.zosh.ecommerce.multivendor.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public void addProduct(Product product) {
        productRepository.save(product);

    }
}
