package com.java.basic.programs.quetions;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer");

        int pal = sc.nextInt();
        int pal2 = pal;
        int y =0;

        while (pal2!=0){


            int pst=pal2%10;
            int x =pst*pst*pst;
            y = y +x;
            pal2 = pal2/10;

        }
        if(y==pal){
            System.out.println("Given no is Armstrong no");
        }else
        System.out.println("not armstrong no");
    }
}
