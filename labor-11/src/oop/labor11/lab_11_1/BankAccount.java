package oop.labor11.lab_11_1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int withdraw) throws InsufficientFundException{
        if(withdraw > balance){
            throw new InsufficientFundException("Nincs Eleg Penz A Szamlan");
        }
        balance = balance - withdraw;
    }
}
