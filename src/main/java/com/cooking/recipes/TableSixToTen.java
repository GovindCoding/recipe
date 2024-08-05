package com.cooking.recipes;

public class TableSixToTen {
    public static void main(String[] args) {
        for (int table = 6; table <= 10; table++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * table + " ");
            }
            System.out.println();
        }
    }
}
