import java.util.Scanner;

public class p06_19M_ControlNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());
        int K = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int xoxo = 0;

        for (int i = 1; i <= N && sum < K; i++) {
            for (int ti = M; ti >= 1 && sum < K; ti--) {
                sum += (i * 2) + (ti * 3);
                xoxo++;
            }
        }
        if (sum >= K) {
            System.out.println(xoxo + " moves");
            System.out.println("Score: " + sum + " >= " + K);
        } else System.out.println(xoxo + " moves");
    }
}