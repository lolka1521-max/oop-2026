package oop.labor05;

import oop.labor05.model.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readCourses {
    public static ArrayList<Course> readFromCSVFile(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(","); // trim: eliminates leading and trailing spaces
                String name = items[0].trim();
                String description = items[1].trim(); // Convert String→int: Integer.parseInt( String)
                int numHour = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHour));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
}
