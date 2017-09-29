import java.util.Scanner;

public class Bonus_peika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        double W = Double.parseDouble(sc.nextLine());
        double L = Double.parseDouble(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());
        int O = Integer.parseInt(sc.nextLine());
        // WL needed for N - MO
        double WL = ((N*N) - M*O) / (W*L);
        double MIN = WL * 0.2;
        System.out.printf("%.2f",WL);
        System.out.printf("%n%.2f",MIN);
    }
}
