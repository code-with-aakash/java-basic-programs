package com.java.basic.programs.bitmanipulation;

public class SwapingOfTwoNumbers {

    public static void main(String[] args) {

        // how to swap two numbers with exor .
        int num1 =8;
        int nums2 =10;

        System.out.println("two numbers before swap is ->" +"num1 ->"+num1+" num2->"+nums2);

        num1 ^= nums2;
        nums2 ^= num1;
        num1 ^= nums2;

        System.out.println("two numbers after swap is ->" +"num1 ->"+num1+" num2->"+nums2);

        int a =19;
        int b =9;
        System.out.println("Before Swapping:");
        System.out.println(a + " " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After Swapping:");
        System.out.println(a + " " + b);


    }

//    we can not use this as here values
//    private static void swapping(int num1, int nums2) {
//
//        num1 ^= nums2;
//        nums2 ^= num1;
//        num1 ^= nums2;
//    }
}
