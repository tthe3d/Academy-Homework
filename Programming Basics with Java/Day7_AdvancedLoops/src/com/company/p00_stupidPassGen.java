package com.company;

import java.util.Scanner;

public class p00_stupidPassGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int l = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++)

        {

            for (int k = 1; k <= n; k++)

            {

                for (char d = (char) 97; d < (char) 97 + l; d++)

                {

                    for (char e = (char) 97; e < (char) 97 + l; e++)

                    {

                        for (int m = 1; m <= n; m++)

                        {

                            if (m > i && m > k)

                            {

                                System.out.printf("%d%d%c%c%d ", i, k, d, e, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
