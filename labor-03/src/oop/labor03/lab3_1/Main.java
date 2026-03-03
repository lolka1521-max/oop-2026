package oop.labor03.lab3_1;

public class Main {
    public static void main(String args[]) {
//        BankAccount acc1 = new BankAccount("BT1");
//        BankAccount acc2 = new BankAccount(10000,"BT2");
//
//        System.out.println("Account1:" + acc1);
//        System.out.println("Account2:" + acc2);
        Customer customer1 = new Customer("Lorand", "Benedek");
        //System.out.println(customer1);
        customer1.setAcc1(new BankAccount(1000, "BT1"));
        //System.out.println(customer1);
        customer1.getAcc1().deposit(2000);
        //System.out.println(customer1);
        Customer customer2 = new Customer("John", "Black");
        System.out.println(customer2);
        customer2.setAcc1(new BankAccount("OTP00001"));
        System.out.println(customer2);
        customer2.getAcc1().deposit(1000);
        System.out.println(customer2);
        Customer customer3 = new Customer("Mary", "White");
        customer3.setAcc1(new BankAccount("OTP00002"));
        System.out.println(customer3);
        customer3.getAcc1().deposit(2000);
        System.out.println(customer3);
        customer3.closeAccount();
        System.out.println(customer3);
        customer3.setAcc1(customer2.getAcc1());
        System.out.println(customer2);
        System.out.println(customer3);
    }
}
