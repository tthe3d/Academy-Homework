import java.util.Scanner;

public class p07_ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int stars = 0;
        for ( int i = 0 ; i <= n ; i++) {
            System.out.print(repeatString(" ", n - stars));
            System.out.print(repeatString("*", stars));
            System.out.print(" | ");
            System.out.println(repeatString("*", stars));
            stars++;
        }

    }

    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <= count; i++) {
            text += toRepeat;
        }
        return text;
    }
}