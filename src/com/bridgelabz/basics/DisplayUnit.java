package com.bridgelabz.basics;

import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        System.out.println("Enter a Single digit number");
        Scanner num=new Scanner(System.in);
        int num1= num.nextInt();
            if(num1==1){
                System.out.println("You entered one unit");
            }
            else if(num1==10){
                System.out.println("You entered Ten unit");
            }
            else if(num1==100){
                System.out.println("You entered Hundred unit");
            }
            else if(num1==1000){
                System.out.println("You entered Thousand unit");
            }
           else {
                System.out.println("Enter valid number unit");
            }
    }
}
