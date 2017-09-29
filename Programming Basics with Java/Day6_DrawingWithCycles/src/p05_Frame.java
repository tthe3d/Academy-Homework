import java.util.Scanner;

public class p05_Frame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print("+");
            } else System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" -");
            }
            if (i == 0 || i == n - 1) {
                System.out.println(" +");
            } else System.out.println(" |");
        }
    }
}
