package com.company;

import java.util.Scanner;

public class p00_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;

            }
            System.out.println(sum);
        }else System.out.println(1);
    }
}
