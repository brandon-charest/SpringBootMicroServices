package com.springcode.fraud;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public record FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {

  public boolean isFraudulentCustomer(Integer customerId) {
    fraudCheckHistoryRepository.save(
        FraudCheckHistory.builder()
            .isFraud(false)
            .customerId(customerId)
            .createdAt(LocalDateTime.now())
            .build()
    );
    return false;
  }
}
