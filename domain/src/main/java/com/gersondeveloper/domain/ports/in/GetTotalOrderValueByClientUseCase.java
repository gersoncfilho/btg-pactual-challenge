package com.gersondeveloper.domain.ports.in;

import java.math.BigInteger;

public interface GetTotalOrderValueByClientUseCase {
    BigInteger getTotalOrdersByClientValue(int clientId);
}
