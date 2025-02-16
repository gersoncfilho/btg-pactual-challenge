package com.gersondeveloper.domain.ports.out;

import com.gersondeveloper.domain.entities.Order;
import com.gersondeveloper.domain.ports.in.messaging.dto.OrderMessage;

import java.util.List;

public interface OrdersRepository {
    void saveOrder(OrderMessage orderMessage);
    Order getOrderByClient(int clientId);
    List<Order> getOrdersByClient(int clientId);
    int getTotalOrdersValueByClient(int clientId);
}
