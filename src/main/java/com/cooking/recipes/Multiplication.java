package com.cooking.recipes;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);

        System.out.print("Enter the number to print table: " );
        int  n = table.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(n + " * " + i + " = " +  n * i);
        }
    }

}
