import java.util.Scanner;

public class p17_TicketsForAGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = Double.parseDouble(sc.nextLine());
        String inputcategory = sc.nextLine().toLowerCase();
        double people = Double.parseDouble(sc.nextLine());
        double category = 0;
        double moneyneeded = 0;


        if (inputcategory.equals("normal")) {
            category = 249.99;
        } else if (inputcategory.equals("vip")) {
            category = 499.99;
        } else System.out.println("Wrong input");


        if (people > 0 && people <= 4) {
            money = money * 0.25;
            moneyneeded = category * people;
            if (money >= moneyneeded) {
                money = money - moneyneeded;
                System.out.printf("Yes! You have %.2f leva left.", money);
            } else if (money < moneyneeded) {
                money = moneyneeded - money;
                System.out.printf("Not enough money! You need %.2f leva.", money);
            }


        } else if (people > 4 && people <= 9) {
            money = money * 0.4;
            moneyneeded = category * people;
            if (money >= moneyneeded) {
                money = money - moneyneeded;
                System.out.printf("Yes! You have %.2f leva left.", money);
            } else if (money < moneyneeded) {
                money = moneyneeded - money;
                System.out.printf("Not enough money! You need %.2f leva.", money);
            }


        } else if (people > 9 && people <= 24) {
            money = money * 0.5;
            moneyneeded = category * people;
            if (money >= moneyneeded) {
                money = money - moneyneeded;
                System.out.printf("Yes! You have %.2f leva left.", money);
            } else if (money < moneyneeded) {
                money = moneyneeded - money;
                System.out.printf("Not enough money! You need %.2f leva.", money);
            }


        } else if (people > 24 && people <= 49) {
            money = money * 0.6;
            moneyneeded = category * people;
            if (money >= moneyneeded) {
                money = money - moneyneeded;
                System.out.printf("Yes! You have %.2f leva left.", money);
            } else if (money < moneyneeded) {
                money = moneyneeded - money;
                System.out.printf("Not enough money! You need %.2f leva.", money);
            }


        } else if (people > 49) {
            money = money * 0.75;
            moneyneeded = category * people;
            if (money >= moneyneeded) {
                money = money - moneyneeded;
                System.out.printf("Yes! You have %.2f leva left.", money);
            } else if (money < moneyneeded) {
                money = moneyneeded - money;
                System.out.printf("Not enough money! You need %.2f leva.", money);
            }
        }
    }
}