package com.java.basic.programs.quetions;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer");

        int pal = sc.nextInt();

       int abc =  factorial(pal);

       System.out.println("factorial of number is->" +abc);


    }

    private static int factorial(int pal) {



                if ( pal==0)
                    return 1;
                else
                return pal *  factorial (pal-1) ;



    }
}
