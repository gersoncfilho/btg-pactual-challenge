package com.gersondeveloper.domain.ports.in;

import java.math.BigDecimal;

public interface GetTotalValueOfOrderUseCase {
    BigDecimal getTotalValueOfOrder(int orderId);
}
