import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p01_TayloringWorkshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double table = Double.parseDouble(sc.nextLine());
        double longside = Double.parseDouble(sc.nextLine());
        double shortside = Double.parseDouble(sc.nextLine());

        double pokrivka = table * (longside + 2 * 0.3) * (shortside+2*0.3);
        double kare = table * (longside / 2) * (longside / 2);
        double priceD = pokrivka * 7 + kare * 9;
        double priceL = priceD * 1.85;

        System.out.printf("%.2f USD%n",priceD);
        System.out.printf("%.2f BGN%n",priceL);

    }
}
