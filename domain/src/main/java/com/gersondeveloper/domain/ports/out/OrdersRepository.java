package com.gersondeveloper.domain.ports.out;

import com.gersondeveloper.domain.entities.Order;
import com.gersondeveloper.domain.ports.in.messaging.dto.OrderMessage;

import java.math.BigDecimal;
import java.util.List;

public interface OrdersRepository {
    void saveOrder(OrderMessage orderMessage);
    BigDecimal listAllClientOrdersValueByClient(int clientId);
    List<Order> listClientOrdersByClient(int clientId);
    BigDecimal getTotalValueOfOrderByOrderId(int orderId);
}
