package com.company;

import java.util.Scanner;

public class p01_1to100in3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n +1;i+=3 ){
            System.out.println(i);
        }
    }
}
