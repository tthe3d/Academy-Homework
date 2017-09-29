import java.util.Scanner;

public class p15_RoadTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalmoney = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine().toLowerCase();

        if (totalmoney > 1000) {
            totalmoney = totalmoney * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", totalmoney);
        }
        if (season.equals("winter")) {
            if (totalmoney <= 100) {
                totalmoney = totalmoney * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f", totalmoney);
            } else if (totalmoney <= 1000) {
                totalmoney = totalmoney * 0.8;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f", totalmoney);
            }
        } else if (season.equals("summer")) {
            if (totalmoney <= 100) {
                totalmoney = totalmoney * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f", totalmoney);
            } else if (totalmoney <= 1000) {
                totalmoney = totalmoney * 0.4;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f", totalmoney);
            }
        }
    }
}