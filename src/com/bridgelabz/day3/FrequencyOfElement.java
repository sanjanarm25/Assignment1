package com.bridgelabz.day2;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int limit =sc.nextInt();
        int [] arr1=new int[limit];
        System.out.println("enter elements of array");
        for(int i = 0; i < limit; i++){
            arr1[i]=sc.nextInt();
        }
            int [] visitedArray = new int [limit];
            int taken = -1;

            for(int i = 0; i < limit; i++){
            int count = 1;
            for(int j = i+1; j < limit; j++){
              if(arr1[i] == arr1[j]){
                    count++;
                  visitedArray[j] = taken;
                }
            }
            if(visitedArray[i] != taken)
                visitedArray[i] = count;

        }


        for(int i = 0; i < visitedArray.length; i++){
            if(visitedArray[i] != taken)
                System.out.println(arr1[i] +" : "+ visitedArray[i]);
        }

    }
}
