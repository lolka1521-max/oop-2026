package oop.labor10.lab10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {
    private String fruit;
    private ArrayList<String> gyumolcsok = new ArrayList<>();

    public SortingDemo(String file){


        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                String fruit = items[0].trim();
                String fruit1 = items[1].trim();
                gyumolcsok.add(fruit);
                gyumolcsok.add(fruit1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFruits(){
        for ( String e: gyumolcsok ) {
            System.out.println(e);
        }
    }

    public void sorReverseAlphabetically(){
        Collections.sort(gyumolcsok,Collections.reverseOrder());
    }


    public void sortAlphabetically(){
        Collections.sort(gyumolcsok);
    }

    public void sortMyDate(){
        Collections.sort(gyumolcsok,(a, b)->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
    }
}
