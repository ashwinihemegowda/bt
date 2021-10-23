package com.torryharris.model;

import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithdrawLimitExceededException;

public class Person {
    private String name;
    private int accountNumber;
    private int balance;
    private int totalAmountWithdrawn;
    private final int DAILY_WITHDRAWAL_LIMIT=40000;

    public Person(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalAmountWithdrawn() {
        return totalAmountWithdrawn;
    }

    public void setTotalAmountWithdrawn(int totalAmountWithdrawn) {
        this.totalAmountWithdrawn = totalAmountWithdrawn;
    }
    public void withDrawAmount(int amount) throws WithdrawLimitExceededException, InsufficientFundsException {
        if(amount>balance)
        {
            throw new InsufficientFundsException("Insufficient balance:\n"+"Your balance is "+balance);
        }
        if(totalAmountWithdrawn+amount>DAILY_WITHDRAWAL_LIMIT)
        {
            throw new WithdrawLimitExceededException("Withdraw Limit Exceeded:\n"+"Total amount Withdrawn today is Rs."+totalAmountWithdrawn);
        }
        balance-=amount;
        totalAmountWithdrawn+=amount;
        System.out.println("Amount Withdrawal for Rs."+amount+" is successful!!");
        System.out.println("Balance is "+balance);
        System.out.println("Total amount withdrawn for today is Rs."+totalAmountWithdrawn);
        System.out.println();

    }
}
