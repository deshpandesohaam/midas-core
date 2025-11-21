package com.midas.core;

public class Transaction {
    private double amount;

    public Transaction() {}

    public Transaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Transaction{amount=" + amount + "}";
    }
}
