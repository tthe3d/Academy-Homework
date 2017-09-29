import java.util.Scanner;

public class p16_OperationsbetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());
        double result = 0;
        String EOD = null;
        double dammit = 0;
        String operator = sc.nextLine();
        if (operator.equals("+")) {
            result = num1 + num2;
            dammit = result % 2;
            if (dammit == 0) {
                EOD = "even";
            } else EOD = "odd";
            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operator, num2, result, EOD);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            dammit = result % 2;
            if (dammit == 0) {
                EOD = "even";
            } else EOD = "odd";

            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operator, num2, result, EOD);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            dammit = result % 2;
            if (dammit == 0) {
                EOD = "even";
            } else EOD = "odd";


            System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operator, num2, result, EOD);
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", num1);
            } else {
                result = num1 / num2;
                dammit = result % 2;
                if (dammit == 0) {
                    EOD = "even";
                } else EOD = "odd";


                System.out.printf("%.0f %s %.0f = %.2f - %s", num1, operator, num2, result, EOD);
            }
        } else if (operator.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", num1);
            } else {
                result = num1 % num2;
                dammit = result % 2;
                if (dammit == 0) {
                    EOD = "even";
                } else EOD = "odd";


                System.out.printf("%.0f %s %.0f = %.0f - %s", num1, operator, num2, result, EOD);
            }
        }
    }
}