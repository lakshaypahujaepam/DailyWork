package com.lakshay.streamsmastery;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionsToAccountTotal {

    static class Transaction {
        private String accountId;
        private double amount;

        public Transaction(String accountId, double amount) {
            this.accountId = accountId;
            this.amount = amount;
        }

        public String getAccountId() {
            return accountId;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "accountId='" + accountId + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

    static List<Transaction> transactions = Arrays.asList(
            new Transaction("ACC1", 1000.0),
            new Transaction("ACC2", 2000.0),
            new Transaction("ACC1", 1500.0),
            new Transaction("ACC3", 3000.0),
            new Transaction("ACC2", 500.0),
            new Transaction("ACC1", 200.0)
    );

    static void computeTotals() {
        Map<String, Double> collect = transactions.stream()
                .collect(Collectors.toMap(Transaction::getAccountId, Transaction::getAmount, Double::sum));

        System.out.println(collect);
    }

    public static void main(String[] args) {
        computeTotals();
    }
}