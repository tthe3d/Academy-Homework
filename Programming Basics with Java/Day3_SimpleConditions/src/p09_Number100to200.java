import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p09_Number100to200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x1 = sc.nextLine();
        String x2 = sc.nextLine();
        if (x1.equals(x2)){
            System.out.print("yes");
        }else System.out.print("no");
    }
}
