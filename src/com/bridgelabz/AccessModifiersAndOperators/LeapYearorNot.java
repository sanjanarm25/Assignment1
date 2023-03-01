package com.bridgelabz.day2;

import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner year =new Scanner(System.in);
        int year1= year.nextInt();
        if(year1>=1582) {
            if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
                System.out.println("Its a Leap Year");
            } else {
                System.out.println("Its not a leap year");
            }
        }else{
            System.out.println("enter year >= 1582, corresponding to a year in the Gregorian calendar.");
        }

    }
}
