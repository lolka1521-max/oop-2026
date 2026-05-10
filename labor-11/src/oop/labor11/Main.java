package oop.labor11;

import oop.labor11.lab_11_1.BankAccount;
import oop.labor11.lab_11_1.InsufficientFundException;
import oop.labor11.lab_11_2.Product;
import oop.labor11.lab_11_2.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Storage ref = new Storage("data.csv");

        ref.update("update.csv");



//        BankAccount b1 = new BankAccount(500);
//        BankAccount b2 = new BankAccount(1000);
//        BankAccount b3 = new BankAccount(2000);
//
//        try {
//            b1.withdraw(250);
//        } catch (InsufficientFundException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(b1.getBalance());
//
//        try {
//            b2.withdraw(1000);
//        } catch (InsufficientFundException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(b2.getBalance());
//
//        try {
//            b3.withdraw(3000);
//        } catch (InsufficientFundException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(b3.getBalance());

        ///demonstrateFinally();

//        System.out.println(readFirstLine("fruit.csv"));
//        System.out.println(readFirstLine("alma.txt"));
//        System.out.println(readFirstLine("path.txt"));
//
//        int a=20,b=10;
//        try{
//            System.out.println(a + " / " + b + " = " + safeDivide(a,b));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        a=20;
//        b=0;
//        try{
//            System.out.println(a + " / " + b + " = " + safeDivide(a,b));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }

    }

    public static void demonstrateFinally(){
        try {
            System.out.println("Copium");
            throw new RuntimeException("Futasideju Hiba");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Ez mindig lefut");
        }
    }

    public static double safeDivide (int a, int b) throws Exception {
        if(b == 0){
            throw new Exception("DIVISION_BY_ZERO");
        }
        return a/b;
    }

    public static String readFirstLine(String path){
        try(Scanner sc = new Scanner(new File(path))){
            if(sc.hasNextLine()){
                return sc.nextLine();
            }
            else {
                return "EMPTY_FILE";
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return  "FILE_NOT_FOUND";
        }
    }
}
