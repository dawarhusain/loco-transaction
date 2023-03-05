package com.example.loco.controller;

import com.example.loco.entities.Transaction;
import com.example.loco.service.LocoService;
import com.example.loco.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private TransactionService transactionService;

    public void saveTransaction() {

    }

    public List<Transaction> getTransactionsByType() {

    }

    public Transaction getTransactionById() {
        return this.transactionService.
    }

    /**
     * @param transactionId
     * @return sum of all descendant transactions
     */
    @GetMapping("/transactionservice/sum/{transactionId}")
    public Double getAmountSumById(@PathVariable Long transactionId) {
        Double sumAmount;
        return sumAmount;
    }


}
