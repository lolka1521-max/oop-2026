package oop.labor03.lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    BankAccount acc1;

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

    public BankAccount getAcc1() {
        return acc1;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAcc1(BankAccount acc1) {
        this.acc1 = acc1;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", acc1=" + acc1 +
                '}';
    }

    public void closeAccount(){
        this.acc1 = null;
    }
}
