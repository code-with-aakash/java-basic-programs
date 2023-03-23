package com.java.basic.programs.quetions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String to check if its palindrome or not ");

        String pal =sc.nextLine();
        String palind="";

        for(int i =pal.length()-1 ; i>=0;i--){

            palind=palind+pal.charAt(i);

        }
        if(pal.equalsIgnoreCase(palind)){
            System.out.print("String is palindrome");
        }

    }
}
