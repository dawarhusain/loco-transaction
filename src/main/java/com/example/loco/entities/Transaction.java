package com.example.loco.entities;

import static java.lang.Double.valueOf;

public class Transaction {
    private Long transactionId;
    private Double amount;
    private Long parentId;
    private String transactionType;

    public Transaction(Long transactionId, Double amount, Long parentId, String transactionType) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.parentId = parentId;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", parentId=" + parentId +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    public Transaction() {
        this.transactionId = null;
        this.amount = (double) 0;
        this.parentId = null;
        this.transactionType = null;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
