package com.midas.core;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "${midas.kafka.topic}", groupId = "midas-core")
    public void handleIncomingTransaction(Transaction transaction) {
        System.out.println("Received transaction: " + transaction);
    }
}
