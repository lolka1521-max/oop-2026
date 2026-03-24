package oop.labor06;

import oop.labor06.felveteli.diak.Diak;
import oop.labor06.felveteli.informatika.Informatika;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Diakokbeolvasasa {
    public static Informatika readFromCSVFile(String fileName) {
        Informatika informatikas = new Informatika();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                String vNev = items[0].trim();
                String kNev = items[1].trim(); // Convert String→int: Integer.parseInt( String)
                double erettsegi = Double.parseDouble(items[2].trim());
                double matematika = Double.parseDouble(items[3].trim());
                informatikas.ujBeiratkozo(new Diak(vNev,kNev,erettsegi,matematika));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return informatikas;
    }
}
