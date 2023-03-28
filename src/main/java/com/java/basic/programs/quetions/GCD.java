package com.java.basic.programs.quetions;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Integer");

        int a = sc.nextInt();

        System.out.println("Enter 2nd Integer");

        int b = sc.nextInt();

        int gcd = GCDNumber(a, b);

        System.out.println("GCD of two numbers " + gcd);


    }

    private static int GCDNumber(int a, int b) {

//        int gcdd = 0;
//    if (b==0)        return a;
//    else  return GCDNumber(b,a%b);

        return  ( b == 0 ) ? a : GCDNumber(b, a % b);


    }
}


