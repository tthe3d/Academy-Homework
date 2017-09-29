package com.company;

import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p02_TriangleOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stars : ");
        int x = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= x ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
