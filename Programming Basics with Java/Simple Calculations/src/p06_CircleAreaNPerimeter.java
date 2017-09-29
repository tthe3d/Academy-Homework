import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p06_CircleAreaNPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle : ");
        double r = Double.parseDouble(sc.nextLine());
        System.out.println("Area is : " + r * Math.PI * r);
        System.out.println("Perimeter is : " + 2 * Math.PI * r);

    }
}
