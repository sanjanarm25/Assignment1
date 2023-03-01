package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year= sc.nextInt();
        if(year>=1000 && year<=9999){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year +" is a leap year");
            }else {
                System.out.println(year +" is not 1a leap year");
            }

        }else{
            System.out.println("enter the valid year i.e four digit number");
        }
    }
}
