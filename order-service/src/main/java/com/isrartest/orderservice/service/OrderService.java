package com.isrartest.orderservice.service;

import com.isrartest.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
