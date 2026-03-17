package oop.labor05.model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    ArrayList<Student> enrolledStudents;
    private int numEnrolled;

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

//    public boolean enroll(Student student){
//        return enrolledStudents(new);
//}

    public Student findStudentById(String ID){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if (enrolledStudents.get(i).getID().equals(ID)) {
                return enrolledStudents.get(i);
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    public void numEnrolled(){
        numEnrolled++;
    }

    public void printToFile(){
        String fileName = course.getName() + "_" + startDate + "_" + endDate;
        System.out.println(fileName);
        try {
            PrintStream out = new PrintStream(fileName);
            for(Student c: enrolledStudents){
                out.println(c);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "numEnrolled=" + numEnrolled +
                ", enrolledStudents=" + enrolledStudents +
                ", pricePerStudent=" + pricePerStudent +
                ", endDate=" + endDate +
                ", startDate=" + startDate +
                ", course=" + course +
                '}';
    }

    public void unEnroll(String ID){
        for (int i = 0; i < enrolledStudents.size(); i++) {
            if(enrolledStudents.get(i).getID().equals(ID)){
                enrolledStudents.remove(ID);
            }
        }
    }
}
