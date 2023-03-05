package com.example.loco.entities;

public class Transaction {
    private Long transactionId;
    private Double amount;
    private Long parentId;

    public Transaction(Long transactionId, Double amount, Long parentId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", parentId=" + parentId +
                '}';
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
}
