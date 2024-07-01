package com.minsproject.hellospring;

import java.io.IOException;
import java.math.BigDecimal;

public interface ExchangeRateProvider {
    BigDecimal getExRate(String currency) throws IOException;
}
