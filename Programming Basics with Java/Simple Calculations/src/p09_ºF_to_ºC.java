import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p09_ºF_to_ºC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ºF : ");
        double ºF = Double.parseDouble(sc.nextLine());
        double ºC = (ºF - 32) / 1.8;
        System.out.print(ºF + " ºF is ");
        System.out.printf("%.2f", ºC);
        System.out.print(" ºC.");
    }
}
