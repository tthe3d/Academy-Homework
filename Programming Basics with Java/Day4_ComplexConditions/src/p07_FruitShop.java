import java.util.Scanner;

public class p07_FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine().toLowerCase();
        String day = sc.nextLine().toLowerCase();
        double quan = Double.parseDouble(sc.nextLine());
        if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(quan * 2.7);
            } else if (fruit.equals("apple")) {
                System.out.println(quan * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(quan * 0.9);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(quan * 1.6);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quan * 3);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quan * 5.6);
            } else if (fruit.equals("grapes")) {
                System.out.println(quan * 4.2);
            }else System.out.println("error");
        } else if (day.equals("monday") || day.equals("tuesday")
                || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            if (fruit.equals("banana")) {
                System.out.println(quan * 2.5);
            } else if (fruit.equals("apple")) {
                System.out.println(quan * 1.2);
            } else if (fruit.equals("orange")) {
                System.out.println(quan * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(quan * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quan * 2.7);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quan * 5.5);
            } else if (fruit.equals("grapes")) {
                System.out.println(quan * 3.85);
            }else System.out.println("error");
        }else System.out.println("error");
    }
}