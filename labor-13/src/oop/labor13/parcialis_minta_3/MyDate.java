package oop.labor13.parcialis_minta_3;

public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return day + "/" + month + "/" + year + "\n";
    }
}
