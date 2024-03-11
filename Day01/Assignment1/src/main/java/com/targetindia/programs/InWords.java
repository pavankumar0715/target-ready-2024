package com.targetindia.programs;

import com.targetindia.utils.KeyboardUtil;


public class InWords {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};
    //Added the international number system for now, will try to change it for next submission
    private static final String[] ind = {"", "Lakh", "Crore"};
    private static String helper(int n) {
        if (n == 0) {
            return "";
        }
        else if (n < 10) {
            return units[n] + " ";
        }
        else if (n < 20) {
            return teens[n - 10] + " ";
        }
        else if (n<100){
            return tens[n / 10] + " " + units[n % 10] + " ";
        }
        else {
            return units[n/100]+" Hundred "+helper(n%100);
        }
    }
    public static String inWords(int n){
        if (n == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (n != 0) {
            if (n % 1000 != 0) {
                words = helper((int)(n % 1000)) + thousands[i] + " " + words;
            }
            n /= 1000;
            i++;
        }

        return words;
    }



    public static void main(String[] args) {
        int num=0;
        num=KeyboardUtil.getInt("Enter a number:");
//        System.out.println("45646 in words is: "+inWords(45646));
//        System.out.println("12 in words is: "+inWords(12));
//        System.out.println("8468782 in words is: "+inWords(8468782));
//        System.out.println("99922 in words is: "+inWords(99922));
        System.out.println(num + " in words is: " +inWords(num));




    }
}