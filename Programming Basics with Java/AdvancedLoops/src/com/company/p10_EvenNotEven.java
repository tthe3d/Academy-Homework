package com.company;

import java.util.Scanner;

public class p10_EvenNotEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter even number: ");
            try {
                int n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    break;
                } else {
                    System.out.println("The number is not even.");

                }
            } catch (Exception e) {
                System.out.println("Invalid number!");

            }

        }

    }

}