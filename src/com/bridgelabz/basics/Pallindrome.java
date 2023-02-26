package com.bridgelabz.basics;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int num1=num;
        int reverse=0;
        for(int i=0;num>0;i++){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(num1==reverse){
            System.out.println("Its a Pallindrome");
        }else{
            System.out.println("Its not a Pallindrome");
        }
    }

}
