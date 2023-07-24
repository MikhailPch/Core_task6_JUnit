package ru.netology;

public class CreditAccount extends Account {
    public CreditAccount(long balance, int creditLimit) {
       super(balance, creditLimit);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= Math.abs(balance)) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= (creditLimit - Math.abs(balance))) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (amount <= (creditLimit - Math.abs(balance)) && account.add(amount)) {
            return pay(amount);
        } else {
            return false;
        }
    }
}