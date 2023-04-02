package com.java.basic.programs.dsu;

import java.util.Scanner;

public class DisjoinSetStructure {


    int[] rank, parent, size;

    int n;

    DisjoinSetStructure(int n ){

        this.n = n;
        parent = new int[n];
        size = new int[n];
        make();

    }

    public void make() {

        for (int i = 1; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

    }

    public int find(int v) {

        if (parent[v] != v) {
            parent[v] = find(parent[v]);
        }

        return parent[v];

    }

    public void Union(int a, int b) {

        a = find(a);
        b = find(b);
        if (a != b) {
            if (size[a] < size[b]) {
                int temp = a;
                a = b;
                b = temp;
            }
            parent[b] = a;
            size[a] = size[a] + size[b];
        }

    }

}

class Calculator {

    public static void main(String[] args) {

        int n = 10;
        DisjoinSetStructure dus =
                new DisjoinSetStructure(n);

        dus.Union(1,2);
        dus.Union(5,6);
        dus.Union(3,4);
        dus.Union(7,8);
        dus.Union(2,4);
        dus.Union(2,5);


        if(dus.find(1)==dus.find(3)){
            System.out.println("in same set");
        }
        else System.out.println("in different set");

        if(dus.find(4)==dus.find(7)){

            System.out.println("in same set");
        }
        else System.out.println("in different set");

    }
    }

    class CityAndFlood{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("enter value of n");

           int n = sc.nextInt();

            System.out.println("enter value of k");
            int k =sc.nextInt();

            DisjoinSetStructure dus =
                    new DisjoinSetStructure(n+1);
            int count = 0;


           while (k>0) {
               System.out.println("enter value of u");
               int u = sc.nextInt();
               System.out.println("enter value of v");
               int v = sc.nextInt();
               dus.Union(u, v);
               k--;
           }



            for(int i=1;i<=n;i++){

                if(dus.find(i)==i){
                    count ++;
                }

            }

            System.out.println("count is "+count);


        }

    }


    class CityAndCampers{
        public static void main(String[] args) {

        }
    }
