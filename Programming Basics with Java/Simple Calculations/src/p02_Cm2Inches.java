import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p02_Cm2Inches {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            out.print("###### WELCOME TO CM TO INCHES CONVERTER ######");
            out.print("\n");
            out.print("\n Centimeters : ");
            double cm = Double.parseDouble(sc.nextLine());
            double inches = cm / 2.54;
            out.printf(cm + " cm" + " = " );
            out.printf("%.2f", inches);
            out.printf(" inches.");
    }
}
