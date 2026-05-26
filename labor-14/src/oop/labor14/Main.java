package oop.labor14;

import oop.labor14.regiszter.SzulElhalalozas;

import java.util.Map;
import java.util.TreeMap;

import static oop.labor14.Beolvas.readFromCSVFile;

public class Main {
    public static void main(String[] args) {
        Map<String, SzulElhalalozas> emberek = new TreeMap<>();
        emberek = readFromCSVFile("input1.txt");

        for (SzulElhalalozas e: emberek.values()){
            if(e.getSzulEv() !=0 && e.gethalEv() != 0){
                System.out.println(e);
            }
        }


    }
}
