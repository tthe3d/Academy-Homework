import java.util.Scanner;

public class p06_minNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 1 ; i <= n ; i++){
            int sum = Integer.parseInt(sc.nextLine());
            if (sum < min){
                min = sum;
            }
        }
        System.out.println(min);
        System.out.println(196000+50000);
    }
}
