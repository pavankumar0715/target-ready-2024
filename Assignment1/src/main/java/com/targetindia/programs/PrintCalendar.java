package com.targetindia.programs;

import com.targetindia.utils.KeyboardUtil;
public class PrintCalendar {

    private static final String[] DAY_NAMES = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    static boolean isValid(int month, int year){
        return ((month<1 || month>12) && year<0);
    }
    static int getDaysInMonth(int month, int year) {
        int maxDays = 31;

        switch (month) {
            case 2:
                maxDays = (isLeap(year)) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
        }
        return maxDays;
    }

    static boolean isLeap(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }


    private static int calculateFirstDayOfMonth(int month, int year) {
        int day = 1;
        int m = (month < 3) ? (month + 10) : (month - 2);
        int y = (month < 3) ? (year - 1) : year;
        int c = y / 100;
        y %= 100;

        return (day + (13 * (m + 1) / 5) + y + (y / 4) + (c / 4) + (5 * c)) % 7 - 1;
    }
    //The formula seems wrong, will try to correct during the next submission

    public static void printCalendar(int month, int year){
        for (String dayName : DAY_NAMES) {
            System.out.print(" " + dayName);
        }
        System.out.println();


        int spaces =  calculateFirstDayOfMonth(month, year);
        if (spaces < 0)
            spaces = 6;

        for (int i = 0; i < spaces; i++) {
            System.out.print("    ");
        }



        int daysInMonth = getDaysInMonth(month, year);
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf(" %4d ", day);

            if (((day + spaces) % 7 == 0) || (day == daysInMonth))
                System.out.println();
        }
        return;
    }


    public static void main(String [] args){
        int month, year;
        month=KeyboardUtil.getInt("Enter the month:");
        year=KeyboardUtil.getInt("Enter the year:");

        printCalendar(month, year);


    }
}
