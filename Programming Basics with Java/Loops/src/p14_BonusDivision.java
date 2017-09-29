import java.util.Scanner;

public class p14_BonusDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for(int i = 0; i < n ; i++){
            int num = Integer.parseInt(sc.nextLine());
            if (num % 2 == 0){
                p1++;
            }
            if (num % 3 == 0){
                p2++;
            }
            if (num % 4 == 0){
                p3++;
            }
        }
        double allnum = n;
        double p_1 = p1 / allnum * 100;
        double p_2 = p2 / allnum * 100;
        double p_3 = p3 / allnum * 100;
        System.out.printf("%n%.2f%%", p_1);
        System.out.printf("%n%.2f%%", p_2);
        System.out.printf("%n%.2f%%", p_3);
    }
}
