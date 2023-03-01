package com.bridgelabz.AccessModifiersAndOperators;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner month=new Scanner(System.in);
        System.out.println("Enter month number");
        int m=month.nextInt();
        Scanner day=new Scanner(System.in);
        System.out.println("Enter day");
        int d=day.nextInt();
        if((m == 3 && d >= 20 && d <= 31)|| (m == 4 && d >=  1 && d <= 30) || (m == 5 && d >=  1 && d <= 31) || (m == 6 && d >=  1 && d <= 20)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
