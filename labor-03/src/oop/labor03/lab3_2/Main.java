package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Main {
    static void main() {
        Customer customer1 = new Customer("Lorand", "Benedek");
        customer1.addAcc1(new BankAccount(20000,"BT1"));
        customer1.addAcc1(new BankAccount(10000,"BT2"));
        customer1.addAcc1(new BankAccount(0,"BT3"));
        customer1.addAcc1(new BankAccount(1000,"BT4"));
        customer1.addAcc1(new BankAccount(10,"BT5"));
        System.out.println(customer1);

        Customer customer2 = new Customer("Hebble", "VauVau");
        customer2.addAcc1(new BankAccount(200000,"BT6"));
        customer2.addAcc1(new BankAccount(1089000,"BT7"));
        customer2.addAcc1(new BankAccount(0,"BT8"));
        customer2.addAcc1(new BankAccount(100074,"BT9"));
        customer2.addAcc1(new BankAccount(111,"BT10"));
        System.out.println(customer2);

    }
}
