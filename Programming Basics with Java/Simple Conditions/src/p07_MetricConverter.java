import java.util.Scanner;

public class p07_MetricConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.nextLine());
        double distance1 = 0;
        double distance2 = 0;
        String input = sc.nextLine();
        switch (input) {
            case "mm":
                distance1 = amount / 1000;
                break;
            case "cm":
                distance1 = amount / 100;
                break;
            case "mi":
                distance1 = amount / 0.000621371192;
                break;
            case "in":
                distance1 = amount / 39.3700787;
                break;
            case "km":
                distance1 = amount / 0.001;
                break;
            case "ft":
                distance1 = amount / 3.2808399;
                break;
            case "yd":
                distance1 = amount / 1.0936133;
                break;
            case "m":
                distance1 = amount / 1;
                break;
            default:
                System.out.print("Wrong input");
                break;
        }

        String output = sc.nextLine();
        switch (output) {
            case "mm":
                distance2 = distance1 * 1000;
                break;
            case "cm":
                distance2 = distance1 * 100;
                break;
            case "mi":
                distance2 = distance1 * 0.000621371192;
                break;
            case "in":
                distance2 = distance1 * 39.3700787;
                break;
            case "km":
                distance2 = distance1 * 0.001;
                break;
            case "ft":
                distance2 = distance1 * 3.2808399;
                break;
            case "yd":
                distance2 = distance1 * 1.0936133;
                break;
            case "m":
                distance2 = distance1 * 1;
                break;
            default:
                System.out.print("Wrong input");
                break;
        }

        System.out.printf("%f %s", distance2, output);
    }
}
