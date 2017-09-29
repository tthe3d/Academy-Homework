import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p09_ºC_to_ºF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ºC : ");
        double ºC = Double.parseDouble(sc.nextLine());
        double ºF = ºC * 1.8 + 32;
        System.out.print(ºC + " ºC is ");
        System.out.printf("%.2f",ºF);
        System.out.print(" ºF.");
    }
}
