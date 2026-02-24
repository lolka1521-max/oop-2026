package oop.labor02;

public class DateUtil {

    private int year=2026;
    private int month=02;
    private int day=24;

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    ///public String toString()

    public static boolean IsLeapYear(int year){
        if ((year %4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
    }

    public static boolean IsValidDate(int year, int month, int day){
        if(IsLeapYear(year) == true){
            if(day>29) return false;
        }
        else{
            if(day>28)return false;
        }
        if(month>12) return false;
        return true;
    }
}
