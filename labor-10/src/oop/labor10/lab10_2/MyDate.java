package oop.labor10.lab10_2;

public class MyDate implements Comparable<MyDate> {
    private int year=2026;
    private int month=02;
    private int day=24;

    public MyDate(int year, int month, int day) {
        //Valid vagy nem be kell tenni
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }

    @Override
    public int compareTo(MyDate o) {
        if( this.year != o.year){
            return this.year - o.year;
        }
        if(this.month != o.month){
            return this.month - o.month;
        }
        return this.day - o.day;
    }
}
