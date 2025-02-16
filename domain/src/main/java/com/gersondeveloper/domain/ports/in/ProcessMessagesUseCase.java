package com.gersondeveloper.domain.ports.in;

import com.gersondeveloper.domain.ports.in.messaging.dto.OrderMessage;

public interface ProcessMessagesUseCase {
    void processMessages(OrderMessage message);
}
