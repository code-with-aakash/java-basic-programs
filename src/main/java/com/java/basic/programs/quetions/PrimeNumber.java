package com.java.basic.programs.quetions;
import java.util.Scanner;
public class PrimeNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = sc.nextInt();

        if(num>0){

            if(num%2!=0 || num==2){
                System.out.println("Given No is prime no ");
            }
            else {
                System.out.println("Given No is Not prime no ");

            }
        }
        else {
            System.out.print("please enter positive integer");
        }

    }
}
