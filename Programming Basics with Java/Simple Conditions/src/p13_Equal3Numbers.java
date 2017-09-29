import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p13_Equal3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        if (num1 == num2 && num2 == num3){
            System.out.print("yes");
        }else System.out.print("no");
    }
}
