package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    BankAccount[] accs1 = new BankAccount[MAX_ACCOUNTS];
    public static final int MAX_ACCOUNTS = 10;
    private int numAccouts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public BankAccount getAcc1(String accountNumber) {
        for (int i = 0; i < numAccouts; i++) {
            if (accs1[i].getAccountNumber().equals(accountNumber)) {
                return accs1[i];
            }
        }
        return null;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAcc1(BankAccount acc1) {
        if(numAccouts < MAX_ACCOUNTS){
            accs1[numAccouts] = acc1;
        }
        numAccouts++;
    }

    @Override
    public String toString() {
        String result = this.firstName + " " +  this.lastName + " Accounts\n";
        for( int i=0 ; i<numAccouts; i++)
            result += "\t" + accs1[i] + "\n";
        return result;
    }

    public String closeAccount(String accountNumber){
        for (int i = 0; i < numAccouts; i++) {
            if(accs1[i].getAccountNumber().equals(accountNumber)){
                this.accs1 = null;
                accs1[i] = accs1[numAccouts];
                numAccouts--;
            }
        }
        return "Nem letezik, nem lehet torolni";
    }
}
