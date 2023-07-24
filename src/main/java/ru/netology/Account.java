package ru.netology;

public abstract class Account {
    protected long balance;
    protected int creditLimit;

    public Account(long balance, int creditLimit) {

    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public abstract boolean transfer(Account account, long amount);

    public long getBalance() {
        return balance;
    }
}