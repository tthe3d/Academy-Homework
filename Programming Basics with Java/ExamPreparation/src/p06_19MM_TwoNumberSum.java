import java.util.Scanner;

public class p06_19MM_TwoNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());
        int MaGiK = Integer.parseInt(sc.nextLine());
        int count = 0;
        int count2 = 0;


        for (int i = one; i >= two;i--){
            for (int b = one;b >= two;b--){
                count++;
                if(i + b == MaGiK) {
                    System.out.println("Combination N:" + count + " (" + i + " + " + b + " = " + MaGiK + ")");
                    count2++;
                    return;
                }
            }
        }
        if (count > 0 && count2 == 0){
            System.out.println(count + " combinations - neither equals " + MaGiK);
        }
    }
}
