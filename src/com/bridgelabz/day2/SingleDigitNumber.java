package com.bridgelabz.basics;

import java.util.Scanner;

public class SingleDigitNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Single digit number");
        Scanner num=new Scanner(System.in);
        int num1= num.nextInt();
            if(num1==0){
                System.out.println("Zero");
            }
            else if(num1==1){
                System.out.println("One");
            }
            else if(num1==2){
                System.out.println("Two");
            }
            else if(num1==3){
                System.out.println("Three");
            }
            else if(num1==4){
                System.out.println("Four");
            }
            else if(num1==5){
                System.out.println("Five");
            }
            else if(num1==6){
                System.out.println("Six");
            }
            else if(num1==7){
                System.out.println("Seven");
            }
            else if(num1==8){
                System.out.println("Eight");
            }
            else if(num1==9){
                System.out.println("Nine");
            }
            else{
                System.out.println("Enter a valid number");
            }

    }
}
