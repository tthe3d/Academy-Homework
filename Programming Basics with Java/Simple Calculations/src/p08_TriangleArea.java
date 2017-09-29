import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double w = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double area = w * h / 2 ;
        System.out.print("\n Area : " + area);

    }
}
