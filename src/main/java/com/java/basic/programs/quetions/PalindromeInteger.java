package com.java.basic.programs.quetions;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer");

        int pal = sc.nextInt();
        int pal2 =pal;
        int palindr=0;

        while (pal2!=0){

            // to get the reminder
            int x = pal2%10;

            //in this if no is 1234 then this will become 40+4 then 40+3 then 430+2 like this
            palindr=palindr*10+x;

            pal2 = pal2/10;


        }

        if(pal==palindr){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }

    }
}
