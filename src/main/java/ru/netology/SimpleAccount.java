package ru.netology;

public class SimpleAccount extends Account {
    public SimpleAccount(long balance) {
        super(balance, 0);
        this.balance = balance;
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }


    @Override
    public boolean pay(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (balance >= amount && account.add(amount)) {
            return pay(amount);
        } else {
            return false;
        }

    }
}
