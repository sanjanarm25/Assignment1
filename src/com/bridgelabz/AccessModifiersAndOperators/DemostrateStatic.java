package com.bridgelabz.AccessModifiersAndOperators;

public class DemostrateStatic {
    static int a=10;
    static int b;
    static void operation(int c){
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);

    }
    static {
        b=a+4;
    }

    public static void main(String[] args) {
        operation(4);
    }
}
