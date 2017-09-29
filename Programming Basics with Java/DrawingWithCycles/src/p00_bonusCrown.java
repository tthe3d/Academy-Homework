import java.util.Scanner;

public class p00_bonusCrown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int space = ((n * 2) - 1 - 3) / 2;
        int dot = 0;
        int midot = -1;

        System.out.print("@");
        System.out.print(repeatString(" ", space));
        System.out.print("@");
        System.out.print(repeatString(" ", space));
        System.out.println("@");
        space--;

        for (int i = 0; i < n / 2; i++) {

            System.out.print("*");
            if (dot > 0)
                System.out.print(repeatString(".", dot));
            System.out.print("*");
            System.out.print(repeatString(" ", space));

            if (n%2 == 0 && space > 0)
            System.out.print("*");
            else if (n%2 != 0)
                System.out.print("*");
                if (midot > 0) {
                    System.out.print(repeatString(".", midot));
                    if (n%2 == 0 && space > 0)
                        System.out.print("*");
                    else if (n%2 != 0)
                        System.out.print("*");
                }
            System.out.print(repeatString(" ", space));

            System.out.print("*");
            if (dot > 0)
                System.out.print(repeatString(".", dot));
            System.out.println("*");
            dot++;
            midot += 2;
            space -= 2;
        }

        System.out.print("*");
        System.out.print(repeatString(".", dot));
        if(n%2 != 0)
            System.out.print("*");
        System.out.print(repeatString("*", (midot - 3) / 2));
        System.out.print(".");
        if(n%2 != 0)
            System.out.print("*");
        System.out.print(repeatString("*", (midot - 3) / 2));
        System.out.print(repeatString(".", dot));
        System.out.println("*");


        for (int i = 0; i < 2; i++) {
            System.out.println(repeatString("*", n * 2 - 1));
        }

    }

    static String repeatString(String toRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
//best crown ever
//try with 21 and 30