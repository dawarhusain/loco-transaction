package com.example.loco.controller;

import com.example.loco.entities.Transaction;
import com.example.loco.service.LocoService;
import com.example.loco.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private TransactionService transactionService;

    @PutMapping("/transactionservice/transaction/{transactionId}")
    public void saveTransaction(@RequestBody Transaction transaction, @PathVariable Long transactionId) {
        transaction.setTransactionId(transactionId);
        this.transactionService.putTransaction(transaction);
    }

    @GetMapping("/transactionservice/types/{transactionType}")
    public ArrayList<Long> getTransactionsByType(@PathVariable String transactionType) {
        System.out.println(transactionType);
        return this.transactionService.getTransactionByType(transactionType);
    }

    @GetMapping("/transactionservice/transaction/{transactionId}")
    public Transaction getTransactionById(@PathVariable Long transactionId) {
        return this.transactionService.getTransactionById(transactionId);
    }

    @GetMapping("/transactionservice/sum/{transactionId}")
    public Double getAmountSumById(@PathVariable Long transactionId) {
        return this.transactionService.getAmountSumById(transactionId);
    }


}
