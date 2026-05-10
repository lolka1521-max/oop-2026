package oop.labor10.lab10_3;

import oop.labor10.lab10_2.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(String file) {

        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                if (items.length == 6) {
                    String lastName = items[0].trim();
                    String firstName = items[1].trim();
                    double salary = Double.parseDouble(items[2].trim());
                    int year = Integer.parseInt(items[3].trim());
                    int month = Integer.parseInt(items[4].trim());
                    int day = Integer.parseInt(items[5].trim());
                    String department = items[6].trim();
                    employees.add(new Manager(new MyDate(year, month, day), salary, lastName, firstName, department));
                } else {
                    String lastName = items[0].trim();
                    String firstName = items[1].trim();
                    double salary = Double.parseDouble(items[2].trim());
                    int year = Integer.parseInt(items[3].trim());
                    int month = Integer.parseInt(items[4].trim());
                    int day = Integer.parseInt(items[5].trim());
                    employees.add(new Employee(new MyDate(year, month, day), salary, lastName, firstName));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fire(int ID) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getID() == ID)
                employees.remove(i);
        }
    }

    public void printAll(PrintStream file) {
        file.println(employees);
        file.close();
    }

    public void printAllManagers(PrintStream file) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getClass().equals("Manager")) {
                file.println(employees.get(i));
            }
        }
        file.close();
    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(employees,(e1,e2)->{
            if(!(e1.getLastName().equals(e2.getLastName()))){
                return e1.getLastName().compareTo(e2.getLastName());
            }
            return e1.getFirstName().compareTo(e2.getFirstName());
        });
    }
}
