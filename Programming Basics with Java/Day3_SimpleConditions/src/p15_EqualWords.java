import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p15_EqualWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x1 = sc.nextLine();
        String x2 = sc.nextLine();
        if (x1.toLowerCase().equals(x2.toLowerCase())){
            System.out.print("yes");
        }else System.out.print("no");
    }
}

