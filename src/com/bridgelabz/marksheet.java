package com.bridgelabz;
import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        System.out.println("Marathi");
        Scanner marathi=new Scanner(System.in);
        int m=marathi.nextInt();

        System.out.println("English");
        Scanner english=new Scanner(System.in);
        int e=english.nextInt();

        System.out.println("Maths");
        Scanner maths=new Scanner(System.in);
        int mm=maths.nextInt();

        System.out.println("Sanskrit");
        Scanner sanskrit=new Scanner(System.in);
        int s=maths.nextInt();

        System.out.println("Hindi");
        Scanner hindi=new Scanner(System.in);
        int h=maths.nextInt();

        float sum=m+e+mm+s+h;
        System.out.println(sum);

        float percentage=(sum/500)*100;
        System.out.println(percentage);

    }
}
