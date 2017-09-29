import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p05_TrapezoidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bottom side length : ");
        double b1 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter top side length : ");
        double b2 = Double.parseDouble(sc.nextLine());
        System.out.print("Enter height : ");
        double h = Double.parseDouble(sc.nextLine());

        System.out.println("Trapezoid Area is : " + (b1+b2) * h / 2);
    }
}
