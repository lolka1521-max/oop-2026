package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer currentCustomer = null;
        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] temp = line.split(",");
                if(line.startsWith("Customer")){
                    System.out.println("This is a Custommer");
                    String temp1 = temp[1].trim();
                    String temp2 = temp[2].trim();
                    customers.add(new Customer(temp1, temp2));
                }
                else{
                    String temp1 = temp[1].trim();
                    double penz = Double.parseDouble(temp[2].trim());
                    currentCustomer.addAccount(new BankAccount(penz, temp1));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
