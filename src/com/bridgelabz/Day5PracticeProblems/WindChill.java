package com.bridgelabz.Day5PracticeProblems;

public class WindChill {
    public static void main(String[] args) {
        double temp = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        double windChillTemp = 35.74 + 0.6215 * temp +
                (0.4275 * temp - 35.75) * Math.pow(velocity, 0.16);

        System.out.println(windChillTemp);

    }
}
