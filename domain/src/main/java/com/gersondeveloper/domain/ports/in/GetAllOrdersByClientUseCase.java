package com.gersondeveloper.domain.ports.in;

import com.gersondeveloper.domain.entities.Order;

import java.math.BigInteger;
import java.util.List;

public interface GetAllOrdersByClientUseCase {
    List<Order> getAllOrdersByClient (int clientId);
}
