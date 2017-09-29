package com.company;

import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p03_SquareOfStarsImposibru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= number - 2; i++) {
            System.out.print("*");
            System.out.print(repeatString(" ", number-2 ));
            System.out.println("*");
        }
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
    }
    static String repeatString(String toRepeat, int count){
        String text = "";
        for(int i = 1 ; i <= count ; i++){
            text = text + toRepeat;
        }
        return text;
    }
}
