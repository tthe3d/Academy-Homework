package com.company;

import java.util.Scanner;

public class p09_PrimeNotPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean prime = true;
        if (n == 0 || n == 1 || n == -11) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("Prime");
            } else System.out.println("Not Prime");
        }
    }
}