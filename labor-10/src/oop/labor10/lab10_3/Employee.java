package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter;

    public Employee(MyDate birthDate, double salary, String lastName, String firstName) {
        this.ID = ++counter;
        this.birthDate = birthDate;
        this.salary = salary;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                ", counter=" + counter +
                '}';
    }
}
