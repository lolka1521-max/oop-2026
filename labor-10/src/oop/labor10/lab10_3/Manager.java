package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(MyDate birthDate, double salary, String lastName, String firstName, String department) {
        super(birthDate, salary, lastName, firstName);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
