package com.company;

import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p00_Bonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter pyramid height : ");
            int num = sc.nextInt();
            for (int i = num; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = num; k >= i; k--) {
                    System.out.print("$");
                }
                for (int k = num; k >= i; k--) {
                    System.out.print("$");
                }
                System.out.println();
            }

        }
    }