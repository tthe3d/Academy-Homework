import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p11_CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of money : ");
        double amount = Double.parseDouble(sc.nextLine());
        double x1 = 0;
        double x2 = 0;
        String x3 = null;
        System.out.print("Input Currency : ");
        String input = sc.nextLine();
        if (input.equals("USD")) {
            x1 = amount * 1.79549;
        }else if (input.equals("EUR")) {
            x1 = amount * 1.95583;
        }else if (input.equals("GBP")) {
            x1 = amount * 2.53405;
        }else if (input.equals("BGN")){
            x1 = amount;
        }else System.out.print("This converter can only convert BGN, EUR, GBP and USD.");
        System.out.print("Output Currency : ");
        String output = sc.nextLine();
        if (output.equals("USD")) {
            x2 = x1 / 1.79549;
            x3 = "USD";
        }else if (output.equals("EUR")) {
            x2 = x1 / 1.95583;
            x3 = "EUR";
        }else if (output.equals("GBP")) {
            x2 = x1 / 2.53405;
            x3 = "GBP";
        }else if (output.equals("BGN")) {
            x2 = x1;
            x3 = "BGN";
        }else System.out.print("This converter can only convert BGN, EUR, GBP and USD.");
        System.out.printf("%.2f", x2);
        System.out.print(" " + x3);
        }
    }
