package com.bridgelabz.day2;

import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number is " +reverse);


    }
}
