package com.company;

        import java.util.Scanner;

public class p07_multiplymultiplymultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;
        for (int i = 1; i <= n;i++){
            num = num * i;
        }
        System.out.println(num);
    }
}
