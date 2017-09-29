import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/20/17.
 */
public class pBonus1_ClassRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = Double.parseDouble(sc.nextLine());
        double jk = Double.parseDouble(sc.nextLine());
        double h = jk - 1;
        double w1 = w * 100;
        double h1 = h * 100;
        double wWorkplaces = Math.floor(w1 / 120);
        double hWorkplaces = Math.floor(h1 / 70);
        double Workplaces = (wWorkplaces * hWorkplaces) - 3;
        System.out.printf("%.0f",Workplaces);
    }
}
