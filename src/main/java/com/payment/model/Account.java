package com.payment.model;

import java.util.Objects;
import java.util.UUID;

public class Account {

    private String accountId;
    private String ownerId;
    private double balance;

    public Account(String ownerId, double balance) {
        this.accountId = UUID.randomUUID().toString();
        this.ownerId = ownerId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public double getBalance() {
        return balance;
    }

    // Business methods — balance can only change through these
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient Funds!");

        this.balance -= amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Account))
            return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public String toString() {
        return String.format("Account{id='%s', ownerId='%s', balance=%.2f}",
                accountId, ownerId, balance);
    }

}
