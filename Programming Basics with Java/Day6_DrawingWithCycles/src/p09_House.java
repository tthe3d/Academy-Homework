import java.util.Scanner;

public class p09_House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int stars = 0;
        int dash = 0;

        if (n % 2 == 0) {
            stars = 2;
        } else stars = 1;

        dash = (n - stars) / 2;

        for (int i = 0; i < (n + 1) / 2; i++) {
            System.out.print(repeatString("-", dash));
            System.out.print(repeatString("*", stars));
            System.out.println(repeatString("-", dash));
            stars += 2;
            dash -= 1;
        }

        for ( int i = 0 ; i < n / 2; i++){
            System.out.print("|");
            System.out.print(repeatString("*", n - 2));
            System.out.println("|");
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