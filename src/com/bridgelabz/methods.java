//package com.bridgelabz;
//
//import java.util.Scanner;
//
//public class methods {
//    public static void p1(){
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("enter number1 : ");
//        int num1= input1.nextInt();
//        System.out.println("enter number2 : ");
//        int num2=input1.nextInt();
//        int product=num1*num2;
//        System.out.println(product);
//    }
//    public static void main(String[] args) {
//        p1();
//
//    }
//}




//package com.bridgelabz;
//
//import java.util.Scanner;
//
//public class methods {
//    public static void p1(int num1,int num2){
//        int product= num1*num2;
//        System.out.println(product);
//
//    }
//    public static void main(String[] args) {
//        p1(18,25);
//        p1(10,24);
//
//    }
//}



//package com.bridgelabz;
//
//import java.util.Scanner;
//
//public class methods {
//    public static int p1(int num1,int num2){
//        int product=num1*num2;
//        return product;
//
//    }
//    public static void main(String[] args) {
//        int product=p1(18,25);
//        System.out.println("product=" +product);
//
//    }
//}



package com.bridgelabz;

public class methods {

    public static void main(String[] args) {
        int z=21;
        int res1=z++ + z++ + ++z + ++z +z++;
        System.out.println(z);
        System.out.println(res1);
        int res2=z-- - z-- +  z++ + --z + z-- - ++z + --z;
        System.out.println(z);
        System.out.println(res2);
    }
}
