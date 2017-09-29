import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p02_Inches2Cm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("###### WELCOME TO INCHES TO CM CONVERTER ######");
        out.print("\n");
        out.print("\n Inches : ");
        double inches = Double.parseDouble(sc.nextLine());
        double cm = inches * 2.54;
        out.printf(inches + " inches" + " = " );
        out.printf("%.2f", cm);
        out.printf(" cm.");
    }
}
