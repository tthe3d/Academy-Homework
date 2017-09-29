package com.company;

import java.util.Scanner;

public class p00_justtryingstuff {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num = 1;


        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                    System.out.print(num + " ");
                    num++;
                    if (num > n)
                        break;
                }
            if (num > n)
                break;
            System.out.println();
            }
        }
    }
