package com.company;

import java.util.Scanner;

public class p03_1to2n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;

        for (int i = 0; i <= n; i++){
            System.out.println(num);
            num*=2;
        }

    }
}
