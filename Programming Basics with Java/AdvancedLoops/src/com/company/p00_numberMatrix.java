package com.company;

import java.util.Scanner;

public class p00_numberMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = i + j + 1 ;
                if (num > n){
                    num = 2 * n-num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
