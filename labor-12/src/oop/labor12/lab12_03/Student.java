package oop.labor12.lab12_03;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String fName;
    private String lName;
    private int id;
    Map<String,Double> grades;
    double avarage;

    public Student(int id,String lName, String fName) {
        this.id = id;
        this.lName = lName;
        this.fName = fName;
        this.grades = new HashMap<>();
        this.avarage = 0.0;
    }

    public int getId(){
        return id;
    }

    public Map getGrades() {
        return grades;
    }

    public double getAvarage(){
        return avarage;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void addGrades(String tantargy, Double grade){
        this.grades.put(tantargy,grade);
    }

    public double computeAvarage(){
        double sum = 0;
        for (Double grade: grades.values()){
            if(grade < 5){
                this.avarage = 0;
                return 0;
            }
            sum = sum + grade;
        }

        double result = sum / grades.size();

        if(result >= 6.0) {
            this.avarage = result;
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fName= " + fName +
                ", lName = " + lName +
                ", grades=" + grades +
                ", avarage=" + avarage +
                '\n';
    }
}
