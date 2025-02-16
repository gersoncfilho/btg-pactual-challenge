package com.gersondeveloper.domain.ports.in.messaging.dto;

import java.util.List;

public class OrderMessage {
    private int OrderCode;
    private int ClientCode;
    private List<ItemMessage> itemMessageList;
}
