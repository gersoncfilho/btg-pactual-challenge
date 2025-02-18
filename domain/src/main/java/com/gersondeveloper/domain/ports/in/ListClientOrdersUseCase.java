package com.gersondeveloper.domain.ports.in;

import com.gersondeveloper.domain.entities.Order;

import java.util.List;

public interface ListClientOrdersUseCase {
    List<Order> listClientOrders (int clientId);
}
