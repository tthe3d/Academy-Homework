import java.util.Scanner;

public class p12_Butterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int wing = n - 2;

        for (int i = 0; i < n - 2;i++) {
            if (i % 2 == 0) {
                System.out.print(repeatString("*", wing));
                System.out.print("\\ /");
                System.out.println(repeatString("*", wing));
            } else {
                System.out.print(repeatString("-", wing));
                System.out.print("\\ /");
                System.out.println(repeatString("-", wing));
            }
        }

        System.out.print(repeatString(" ",wing+1));
        System.out.print("@");
        System.out.println(repeatString(" ",wing+1));

        for (int i = 0; i < n - 2;i++) {
            if (i % 2 == 0) {
                System.out.print(repeatString("*", wing));
                System.out.print("/ \\");
                System.out.println(repeatString("*", wing));
            } else {
                System.out.print(repeatString("-", wing));
                System.out.print("/ \\");
                System.out.println(repeatString("-", wing));
            }
        }
    }
    static String repeatString(String toRepeat, int count){
        String text = "";
        for(int i = 0; i<count;i++){
            text+=toRepeat;
        }
        return text;
    }
}

/*
        #####################
        .######### #########.
        ..#######   #######..
        ...##### (@) #####...
        ....###       ###....
        .....#         #.....
        ......#########......
        .......#######.......
        ........#####........
        .........###.........
        ..........#..........

@      @      @
**     *     **
*.*   *.*   *.*
*..* *...* *..*
*...*.....*...*
*....**.**....*
***************
***************
*/