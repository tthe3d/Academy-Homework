
import java.util.Scanner;

public class addtoString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        String text = "";

        for (int i = 1; i <= number; i++) {
            for (int j = i + 1; j <= number; j++) {
                for (int k = j + 1; k <= number; k++) {
                    if (i <= 28 && j <= 29 && k <= 30) {
                        if (i + j + k == number) {
                            text = text + String.format("%d + %d + %d = %d\n", i, j, k, number);
                        }
                    }
                }
            }
        }

        for (int i = 3; i <= number; i++) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 1; k--) {
                    if (i <= 30 && j <= 29 && k <= 28) {
                        if (i * j * k == number) {
                            text = text + String.format("%d * %d * %d = %d\n", i, j, k, number);
                        }
                    }
                }
            }
        }

        if (text.equals("")) {
            System.out.println("No!");
        } else {
            System.out.println(text);
        }
    }
}