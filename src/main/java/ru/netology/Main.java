package ru.netology;

public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(1000);
        CreditAccount creditAccount = new CreditAccount(0, 1000);

        System.out.println(simpleAccount.add(1000));
        System.out.println(simpleAccount.balance);

        System.out.println(creditAccount.add(500));
        System.out.println(creditAccount.balance);

        System.out.println(simpleAccount.pay(500));
        System.out.println(simpleAccount.pay(3000));
        System.out.println(simpleAccount.balance);

        System.out.println(creditAccount.pay(500));
        System.out.println(creditAccount.pay(2000));
        System.out.println(creditAccount.balance);

        System.out.println(simpleAccount.transfer(creditAccount, 500));
        System.out.println(simpleAccount.balance);
        System.out.println(creditAccount.balance);

        System.out.println(creditAccount.transfer(simpleAccount, 1000));
        System.out.println(simpleAccount.balance);
        System.out.println(creditAccount.balance);


    }
}