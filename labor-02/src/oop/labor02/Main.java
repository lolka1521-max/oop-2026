package oop.labor02;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        /*
        /// 1 es Feladat
        BankAccount account1 = new BankAccount("BT1");
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());
        */
        /*
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());
        boolean reuslt = account1.withdraw(500);
        if(!reuslt){
            System.out.println("Not enough funds");
        }
        else{
            System.out.println("Van eleg dolog s meg lehet csinalni");
        }
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());

        boolean reuslt1 = account1.withdraw(1000);
        if(!reuslt1){
            System.out.println("Not enough funds");
        }
        else{
            System.out.println("The Operation was succesfull");
        }
        System.out.println(account1.getAccountnumber() + ":" + account1.getBalance());

        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountnumber() + ":" + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountnumber() + ":" + account2.getBalance());
         */

        /*
        /// A 2 es Feladat
        Rectangle rectangle1 = new Rectangle(-5,0);
        System.out.println("Length: " + rectangle1.getLength() + " Width: " + rectangle1.getwidth() + " Area: " + rectangle1.area() + " Perimeter: " + rectangle1.perimeter());
        Rectangle[] rectangles = new Rectangle[10];
        for(int i=0; i<rectangles.length; i++)
            System.out.println(rectangles[i]);

        Random rand = new Random();
        //generate positive random numbers less than a bound

        double AreaSum = 0;
        for(int i = 1; i < rectangles.length; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Length: " + rectangles[i].getLength() + " Width: " + rectangles[i].getwidth() + " Area: " + rectangles[i].area() + " Perimeter: " + rectangles[i].perimeter());
            AreaSum += rectangles[i].area();
        }
        System.out.println("Az Area osszege: " + AreaSum);

         */

        ///3 mas Feladat
        DateUtil[] date = new DateUtil[1000];
        Random rand = new Random();
        for(int i=0; i < date.length; i++) {
            int day = 1 + rand.nextInt(31);
            int month = 1 + rand.nextInt(11);
            int year = 1 + rand.nextInt();
            boolean result2 = date[i].IsValidDate(year,month,day);
            if(result2 == true) {
                System.out.println("The date was valid: " + day + " " + month + " " + year);
            }
        }
    }


}
