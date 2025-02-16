package com.gersondeveloper.domain.services;

import com.gersondeveloper.domain.entities.Order;

import java.math.BigInteger;
import java.util.List;

public interface OrdersService {
    List<Order> getAllOrdersByClient (int clientId);
    BigInteger getTotalOrdersByClientValue(int clientId);
    BigInteger getTotalOrdersValue();
}
