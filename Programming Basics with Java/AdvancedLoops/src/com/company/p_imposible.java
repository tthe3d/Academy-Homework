package com.company;

import java.util.Scanner;

public class p_imposible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());


            for (int a = 1; a <= 9; a++){
                for (int b = 1 ; b <= 9; b++){
                    for (int c = 1 ; c <= 9;c++){
                        for ( int d = 1 ; d <= 9;d++){
                            for (int e = 1 ; e <= 9 ; e++){
                                for (int f = 1 ; f <= 9;f++){
                                    if(a*b*c*d*e*f == n){
                                        System.out.printf("%d%d%d%d%d%d ",a,b,c,d,e,f);
                                    }
                                }
                            }
                        }
                    }
                }
        }
    }
}
