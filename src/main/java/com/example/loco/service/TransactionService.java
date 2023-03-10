package com.example.loco.service;

import com.example.loco.dao.TransactionDao;
import com.example.loco.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService implements LocoService {

    @Autowired
    private TransactionDao transactionDao;


    public Transaction getTransactionById(Long transactionId) {
        var transaction = transactionDao.findById(transactionId);
        return transaction.orElse(null);
    }

    public void putTransaction(Transaction transaction) {
        transactionDao.save(transaction);
    }

    public ArrayList<Long> getTransactionByType(String transactionType) {
        ArrayList<Long> transactionList = new ArrayList<>(transactionDao.findAllByTransactionType(transactionType).stream().map(e -> e.getTransactionId()).collect(Collectors.toList()));
        return transactionList;
    }

    public Double getAmountSumById(Long transactionId) {
        return transactionDao.getSumOfSubtree(transactionId);
    }


}
