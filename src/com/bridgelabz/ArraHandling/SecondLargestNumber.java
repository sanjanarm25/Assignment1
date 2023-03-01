package com.bridgelabz.ArraHandling;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int limit =sc.nextInt();
        int [] arr1=new int[limit];
        System.out.println("enter elements of array");
        for(int i = 0; i < limit; i++){
            arr1[i]=sc.nextInt();
        }
        int temp=0;
        for(int i = 0; i<arr1.length; i++ ){
            for(int j = i+1; j<arr1.length; j++){

                if(arr1[i]>arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(" second largest number is: "+arr1[arr1.length-2]);
    }
}
