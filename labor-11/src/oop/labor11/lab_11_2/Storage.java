package oop.labor11.lab_11_2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    ArrayList<Product> products = new ArrayList<>();

    public Storage(String path){
        try (Scanner sc = new Scanner(new File(path))){
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.isEmpty()){
                    System.out.println("Empty");
                }
                else{
                    String items[] = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    String name = items[1].trim();
                    int amount = Integer.parseInt(items[2].trim());
                    int price = Integer.parseInt(items[3].trim());
                    products.add(new Product(id,name,amount,price));
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Collections.sort(products);
        System.out.println(products);
    }

    public void update(String path){
        int db = 0;
        try (Scanner sc = new Scanner(new File(path))){
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.isEmpty()){
                    System.out.println("Empty");
                }
                else{
                    String items[] = line.split(" ");
                    int id = Integer.parseInt(items[0].trim());
                    int amount = Integer.parseInt(items[1].trim());
                    Product p = new Product(id,"",0,0);
                    int pos = Collections.binarySearch(products,p);
                    if(pos >= 0){
                        db++;
                        products.get(pos).increaseAmount(amount);
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ennyiszer volt frissitve a lista: " + db);
        System.out.println(products);
    }

}
