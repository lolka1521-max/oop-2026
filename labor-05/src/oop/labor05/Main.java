package oop.labor05;
import oop.labor05.model.Course;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static oop.labor05.readCourses.readFromCSVFile;
import static oop.labor05.readStudents.readFromCSVFilestudent;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readFromCSVFile("courses.csv");
        for(int i=0; i<courses.size(); i++) {
            System.out.println(courses.get(i).toString());
        }
        System.out.println();

        ArrayList<Student> students = readFromCSVFilestudent("student.csv");
        for(int i=0; i<students.size(); i++) {
            System.out.println(students.get(i).toString());
        }

        ArrayList<Training> trainings= new ArrayList<>();
    }
}

