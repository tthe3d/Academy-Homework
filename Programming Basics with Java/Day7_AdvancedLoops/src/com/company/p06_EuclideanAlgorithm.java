package com.company;

        import java.util.Scanner;

public class p06_EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        while (b!=0){
            int oldb = b;
            b = a % b;
            a = oldb;
        }
        System.out.println("GCD = " + a);
    }
}
