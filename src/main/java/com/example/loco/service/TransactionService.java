package com.example.loco.service;

import com.example.loco.dao.TransactionDao;
import com.example.loco.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        Transaction transaction = new Transaction();
        transaction.setTransactionType(transactionType);
        ArrayList<Long> transactionList=null;
//        var transactionList = transactionDao.findBy(transaction, (Transaction t) -> {
//            return transaction.getTransactionType().equals(t.getTransactionType());
//        });
        return transactionList;
    }

    public Double getAmountSumById(Long transactionId) {
        Double amount = (double) 0;
        return amount;
    }

}
