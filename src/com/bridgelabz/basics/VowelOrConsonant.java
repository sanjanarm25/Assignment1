package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println(ch + " is a vowel");
                break;
            case 'e':
                System.out.println(ch + " is a vowel");
                break;
            case 'i':
                System.out.println(ch + " is a vowel");
                break;
            case 'o':
                System.out.println(ch +" is a vowel");
                break;
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");


        }
    }
}
