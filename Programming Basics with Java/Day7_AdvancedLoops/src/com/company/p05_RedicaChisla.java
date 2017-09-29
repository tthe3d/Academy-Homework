package com.company;

        import java.util.Scanner;

public class p05_RedicaChisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num = (num * 2) +1  ;
        }
    }
}