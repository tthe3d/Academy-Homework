import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p16_BonusTransport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = Double.parseDouble(sc.nextLine());
        String dayornight = sc.nextLine();
        double money = 0;
        if (dayornight.equals("day")) {
            if (km < 20) {
                money = km * 0.79 + 0.7;
            } else if (km < 100) {
                money = km * 0.09;
            } else if (km >= 100) {
                money = km * 0.06;
            }
        }
        if (dayornight.equals("night")) {
            if (km < 20) {
                money = km * 0.9 + 0.7;
            } else if (km < 100) {
                money = km * 0.09;
            } else if (km >= 100) {
                money = km * 0.06;
            }
        }
        if (dayornight.equals("day") && km > 0 || dayornight.equals("night") && km > 0){
            System.out.printf("%.2f leva for %.2f km during the %s.",money,km,dayornight);
        }else System.out.print("Начукай си го отзад!");
    }
}