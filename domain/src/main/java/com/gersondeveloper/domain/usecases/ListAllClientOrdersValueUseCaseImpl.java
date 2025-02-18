package com.gersondeveloper.domain.usecases;

import com.gersondeveloper.domain.ports.in.ListAllClientOrdersValueUseCase;
import com.gersondeveloper.domain.ports.out.OrdersRepository;

import java.math.BigDecimal;

public class ListAllClientOrdersValueUseCaseImpl implements ListAllClientOrdersValueUseCase {

    private final OrdersRepository repository;

    public ListAllClientOrdersValueUseCaseImpl(OrdersRepository repository) {
        this.repository = repository;
    }

    @Override
    public BigDecimal listAllClientOrdersValueByClient(int clientId) {
        return repository.listAllClientOrdersValueByClient(clientId);
    }
}
