package oop.labor14;

import oop.labor14.regiszter.SzulElhalalozas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Beolvas {
    public static Map<String, SzulElhalalozas> readFromCSVFile(String fileName) {
        Map<String, SzulElhalalozas> szulElhalalozasMap = new TreeMap<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] items = line.split(" "); // trim: eliminates leading and trailing spaces
                if (items.length == 3) {
                    String vNev = items[0].trim();
                    int szulEv = Integer.parseInt(items[1].trim());
                    int halEv = Integer.parseInt(items[2].trim());
                    szulElhalalozasMap.put(vNev, new SzulElhalalozas(vNev, szulEv, halEv));
                }
                else {
                    String vNev = items[0].trim();
                    int szulEv = Integer.parseInt(items[1].trim());
                    szulElhalalozasMap.put(vNev, new SzulElhalalozas(vNev, szulEv, 0));
                }
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] items = line.split(" "); // trim: eliminates leading and trailing spaces
                String vNev = items[0].trim();
                int halEv = Integer.parseInt(items[1].trim());

                if(!szulElhalalozasMap.containsKey(vNev)){
                    szulElhalalozasMap.put(vNev, new SzulElhalalozas(vNev, 0, halEv));
                }
                else {
                    SzulElhalalozas ember = szulElhalalozasMap.get(vNev);
                    ember.setHalEv(halEv);
                }

            }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
            return szulElhalalozasMap;
        }
    }
