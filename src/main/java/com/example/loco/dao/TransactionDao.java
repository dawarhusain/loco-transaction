package com.example.loco.dao;

import com.example.loco.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;


public interface TransactionDao extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByTransactionType(String transactionType);

    @Query(value = """
            WITH RECURSIVE t(transaction_id, amount) as (
                  	select transaction_id, amount
                  	from transaction
                  	where transaction_id=?1
                  	union
                  	select t2.transaction_id, t2.amount
                  	from transaction t2
                  	join t on t.transaction_id = t2.parent_id
                  )
              select sum(amount)
              from t;
            """, nativeQuery = true)
    Double getSumOfSubtree(Long transactionId);

}
