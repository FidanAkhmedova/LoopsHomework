package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queryCount = scanner.nextInt();

        for (int i = 0; i < queryCount; i++) {
            System.out.println("Enter arguments of " + i +"th query: ");
            System.out.println("Enter a: ");
            int a = scanner.nextInt();

            System.out.println("Enter b: ");
            int b = scanner.nextInt();

            System.out.println("Enter n: ");
            int n = scanner.nextInt();

            calculateQuery(a, b, n);
        }

    }

    public static void calculateQuery(int a, int b, int n){
        double formula = a;

        for (int j = 0; j < n; j++) {
            formula += Math.pow(2.0, j) * b;
            System.out.println(formula);
        }
    }

}
