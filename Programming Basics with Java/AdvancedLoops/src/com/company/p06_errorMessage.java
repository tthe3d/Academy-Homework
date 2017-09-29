package com.company;

import java.util.Scanner;

public class p06_errorMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean yorn=false;
        while (yorn == false){
            System.out.println("Enter a number in the range [1. . .100]: ");
            int n = Integer.parseInt(sc.nextLine());
            if (n > 0 && n < 101){
                System.out.println("The number is: " + n);
                yorn = true;
            }else System.out.println("Invalid number!");
        }
    }
}
