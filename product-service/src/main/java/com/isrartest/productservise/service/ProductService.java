package com.isrartest.productservise.service;

import com.isrartest.productservise.dto.ProductRequest;
import com.isrartest.productservise.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
