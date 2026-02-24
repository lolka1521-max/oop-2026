package oop.labor02;

public class BankAccount {
    private String accountnumber;
    private double balance;

    public BankAccount(String aNumber){
        accountnumber = aNumber;
    }

    public String getAccountnumber(){
        return accountnumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount > balance) return false;
        balance -= amount;
        return true;
    }

}

