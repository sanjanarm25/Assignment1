package com.bridgelabz.day3;

import java.util.Scanner;

public class OddPositionElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int limit =sc.nextInt();
        int [] arr1=new int[limit];
        System.out.println("enter elements of array");
        for(int i = 0; i < limit; i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){

            if(i%2!=0){
                System.out.println(arr1[i]);
            }

        }

    }
}
