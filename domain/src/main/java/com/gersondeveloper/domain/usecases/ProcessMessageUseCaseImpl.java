package com.gersondeveloper.domain.usecases;

import com.gersondeveloper.domain.ports.in.ProcessMessagesUseCase;
import com.gersondeveloper.domain.ports.in.messaging.dto.OrderMessage;
import com.gersondeveloper.domain.ports.out.OrdersRepository;

public class ProcessMessageUseCaseImpl implements ProcessMessagesUseCase {

    private final OrdersRepository repository;

    public ProcessMessageUseCaseImpl(OrdersRepository repository) {
        this.repository = repository;
    }

    @Override
    public void processMessages(OrderMessage message) {
        repository.saveOrder(message);
    }
}
