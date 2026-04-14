package oop.labor07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JarmuBeolvas {
    public static ArrayList<Jarmu> readFromCSVFile(String fileName) {
        ArrayList<Jarmu> jarmus = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                String jarmu = items[0].trim();
                if(jarmu.equals("AUTO")){
                    String rendszam = items[1].trim();
                    String marka = items[2].trim();
                    int utasszam = Integer.parseInt(items[3].trim());
                    jarmus.add(new Auto(rendszam,marka,utasszam));
                }
                else{
                    String rendszam = items[1].trim();
                    String marka = items[2].trim();
                    String tipus = items[3].trim();
                    jarmus.add(new Motorbicikli(rendszam,marka,tipus));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jarmus;
    }
}

