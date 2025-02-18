package com.gersondeveloper.domain.usecases;

import com.gersondeveloper.domain.entities.Order;
import com.gersondeveloper.domain.ports.in.ListClientOrdersUseCase;
import com.gersondeveloper.domain.ports.out.OrdersRepository;

import java.util.List;

public class ListClientOrdersUseCaseImpl implements ListClientOrdersUseCase {

    private final OrdersRepository repository;

    public ListClientOrdersUseCaseImpl(OrdersRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Order> listClientOrders(int clientId) {
        return repository.listClientOrdersByClient(clientId);
    }
}
