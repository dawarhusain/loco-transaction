package com.example.loco.dao;

import com.example.loco.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.function.Function;

public interface TransactionDao extends JpaRepository<Transaction, Long> {

}
