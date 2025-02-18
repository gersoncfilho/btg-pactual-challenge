package com.gersondeveloper.domain.usecases;

import com.gersondeveloper.domain.ports.in.GetTotalValueOfOrderUseCase;
import com.gersondeveloper.domain.ports.out.OrdersRepository;

import java.math.BigDecimal;

public class GetTotalValueOfOrderUseCaseImpl implements GetTotalValueOfOrderUseCase {

    private final OrdersRepository repository;

    public GetTotalValueOfOrderUseCaseImpl(OrdersRepository repository) {
        this.repository = repository;
    }

    @Override
    public BigDecimal getTotalValueOfOrder(int orderId) {
        return repository.getTotalValueOfOrderByOrderId(orderId);
    }
}
