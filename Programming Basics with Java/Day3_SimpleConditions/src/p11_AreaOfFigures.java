import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p11_AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        if (figure.equals("square")){
            double side = Double.parseDouble(sc.nextLine());
            System.out.print(side * side);
        }else if (figure.equals("rectangle")){
            double side1 = Double.parseDouble(sc.nextLine());
            double side2 = Double.parseDouble(sc.nextLine());
            System.out.print(side1 * side2);
        }else if (figure.equals("circle")){
            double rad = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", rad * Math.PI * rad);
        }else if (figure.equals("triangle")){
            double side = Double.parseDouble(sc.nextLine());
            double height = Double.parseDouble(sc.nextLine());
            System.out.print((side * height) / 2);
        }
    }
}
