package com.dev.luana.payment_gateway.repository;

import com.dev.luana.payment_gateway.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Aqui o Spring já nos dá métodos como save(), findById(), etc.
}