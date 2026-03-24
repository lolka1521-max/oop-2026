package oop.labor06;

import oop.labor06.felveteli.diak.Diak;
import oop.labor06.felveteli.informatika.Informatika;

import static oop.labor06.Diakokbeolvasasa.readFromCSVFile;

public class Main {
    public static void main(String[] args) {
        Informatika informatikas = new Informatika();
        Diak diak = new Diak("Mezei", "Maria", 7.56, 8.78);
        informatikas.ujBeiratkozo(diak);
        informatikas.ujBeiratkozo(new Diak("Asztalos","Imre",8.45 , 7.25));
        informatikas.listazOsszes();
        System.out.println("*************************************");

        informatikas = readFromCSVFile("diakok.csv");

        informatikas.ujBeiratkozo(new Diak("Mezei", "Maria", 7.56, 8.78));
        informatikas.ujBeiratkozo(new Diak("Asztalos","Imre",8.45 , 7.25));

        informatikas.nagyobbAtlag(8);
        System.out.println("*************************************");
        System.out.println(informatikas.felvetelizokAtlaga());
        System.out.println(informatikas.felvetelizokSzama());

    }
}
