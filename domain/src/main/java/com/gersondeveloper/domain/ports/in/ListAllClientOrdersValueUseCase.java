package com.gersondeveloper.domain.ports.in;

import java.math.BigDecimal;

public interface ListAllClientOrdersValueUseCase {
    BigDecimal listAllClientOrdersValueByClient(int clientId);
}
