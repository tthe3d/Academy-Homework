import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p10_Rad2Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radian : ");
        double rad = Double.parseDouble(sc.nextLine());
        double degree = (rad * 180) / Math.PI;
        System.out.printf("%.2f", degree);
        System.out.print(" Degrees");
    }
}
