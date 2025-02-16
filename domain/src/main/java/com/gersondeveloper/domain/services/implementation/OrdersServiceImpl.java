package com.gersondeveloper.domain.services.implementation;

import com.gersondeveloper.domain.entities.Order;
import com.gersondeveloper.domain.services.OrdersService;

import java.math.BigInteger;
import java.util.List;

public class OrdersServiceImpl implements OrdersService {


    @Override
    public List<Order> getAllOrdersByClient(int clientId) {
        return List.of();
    }

    @Override
    public BigInteger getTotalOrdersByClientValue(int clientId) {
        return null;
    }

    @Override
    public BigInteger getTotalOrdersValue() {
        return null;
    }
}
