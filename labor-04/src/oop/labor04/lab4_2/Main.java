package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if(line.startsWith("Customer")){
                    System.out.println("This is a Custommer");
                    String[] temp = line.split(",");
                    String temp1 = temp[1].trim();
                    String temp2 = temp[2].trim();
                    customers.get(customers.size()-1).addAccount();
                }
                else{
                    System.out.println("This is a BankAccount");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
