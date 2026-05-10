package oop.labor10.lab10_2;

public class DateUtil {

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
