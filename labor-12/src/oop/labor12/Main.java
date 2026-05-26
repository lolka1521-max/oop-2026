package oop.labor12;

import oop.labor12.lab12_03.BAC;
import oop.labor12.lab12_03.Student;

public class Main {
    public static void main(String[] args) {
        BAC students = new BAC("nevek1.txt");

        students.Subject("roman.txt");
        students.Subject("matek.txt");
        students.Subject("magyar.txt");

        students.computeAvarage();

        students.whoPassed();

        students.alphabeticalOrder();
    }
}
