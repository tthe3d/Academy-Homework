import java.util.Scanner;

public class p08_Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.print(repeatString("*", n * 2));
        System.out.print(repeatString(" ", n));
        System.out.println(repeatString("*", n * 2));
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            System.out.print(repeatString("/", n * 2 - 2));
            System.out.print("*");
            if (n % 2 == 0) {
                if (i == (n - 2) / 2 - 1) {
                    System.out.print(repeatString("|", n));
                } else System.out.print(repeatString(" ", n));
            } else if (n % 2 != 0){
                if (i == (n - 2) / 2) {
                    System.out.print(repeatString("|", n));
                } else System.out.print(repeatString(" ", n));
            }
                System.out.print("*");
                System.out.print(repeatString("/", n * 2 - 2));
                System.out.println("*");
            }
            System.out.print(repeatString("*", n * 2));
            System.out.print(repeatString(" ", n));
            System.out.println(repeatString("*", n * 2));
        }
    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <= count; i++) {
            text += toRepeat;
        }
        return text;
    }
}