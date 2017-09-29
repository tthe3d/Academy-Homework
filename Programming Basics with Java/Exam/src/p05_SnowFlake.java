import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p05_SnowFlake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int dot = 0;
        int middledot = n;
        for (int i = 1; i < n;i++){
            System.out.print(repeatString(".", dot));
            System.out.print("*");
            System.out.print(repeatString(".", middledot));
            System.out.print("*");
            System.out.print(repeatString(".", middledot));
            System.out.print("*");
            System.out.println(repeatString(".", dot));
            middledot--;
            dot++;
        }
        System.out.print(repeatString(".", dot));
        System.out.print(repeatString("*", 5));
        System.out.println(repeatString(".", dot));
        System.out.println(repeatString("*", 2*n+3));
        System.out.print(repeatString(".", dot));
        System.out.print(repeatString("*", 5));
        System.out.println(repeatString(".", dot));
        dot--;
        middledot++;

        for (int i = 1; i < n;i++){
            System.out.print(repeatString(".", dot));
            System.out.print("*");
            System.out.print(repeatString(".", middledot));
            System.out.print("*");
            System.out.print(repeatString(".", middledot));
            System.out.print("*");
            System.out.println(repeatString(".", dot));
            middledot++;
            dot--;
        }

    }
    static String repeatString(String toRepeat,int count){
        String text = "";
        for ( int i = 0; i < count;i++){
            text+=toRepeat;
        }
        return text;
    }
}
