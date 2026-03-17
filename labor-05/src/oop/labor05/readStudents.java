package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readStudents {

    public static ArrayList<Student> readFromCSVFilestudent(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                String ID = items[0].trim();
                String firstName = items[1].trim(); // Convert String→int: Integer.parseInt( String)
                String lastName = items[2].trim();
                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

}
