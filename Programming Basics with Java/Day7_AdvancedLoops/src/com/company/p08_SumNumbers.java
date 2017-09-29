package com.company;

import java.util.Scanner;

public class p08_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 0;
        int sum = 0;
        while (n>0){
            int lastnum = 0;
            lastnum = n % 10;
            sum = lastnum + num;
            num = sum;
            n = n / 10;
        }
        System.out.println(num);
    }
}
