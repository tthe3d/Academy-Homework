import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());
        double width = Math.max(x1,x2) - Math.min(x1,x2);
        double height = Math.max(y1,y2) - Math.min(y1,y2);
        System.out.print("\nArea is : " + width * height);
        System.out.print("\nPerimeter is : " + 2 * (width + height));

    }
}
