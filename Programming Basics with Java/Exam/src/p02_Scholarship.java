import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p02_Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = Double.parseDouble(sc.nextLine());
        double grades = Double.parseDouble(sc.nextLine());
        double minSalary = Double.parseDouble(sc.nextLine());
        double money = 0;
        if (grades <= 4.5 || grades < 5.5 && income > minSalary) {
            System.out.print("You cannot get a scholarship!");
        } else if (grades > 4.5 && grades < 5.5 && income < minSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(minSalary * 0.35));
        } else if (grades >= 5.5 && income >= minSalary) {
            money = grades * 25;
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(money));
        } else if (grades >= 5.5 && income < minSalary) {
            money = grades * 25;
            if ((minSalary * 0.35) > money) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(minSalary * 0.35));
            } else
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(money));
        }

    }
}