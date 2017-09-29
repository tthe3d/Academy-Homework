import java.util.Scanner;

public class p08_TradeComissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine().toLowerCase();
        double sells = Double.parseDouble(sc.nextLine());
        double per = -1;
        double result = 0;


        if (city.equals("sofia")) {
            if (sells < 0) {
                System.out.println("error");
            }else if (sells <= 500) {
                per = 0.05;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 1000 && sells > 500) {
                per = 0.07;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 10000 && sells > 1000) {
                per = 0.08;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells > 10000) {
                per = 0.12;
                result = sells * per;
                System.out.printf("%.2f", result);
            }


        } else if (city.equals("varna")) {
            if (sells < 0) {
                System.out.println("error");
            }else if (sells <= 500) {
                per = 0.045;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 1000 && sells > 500) {
                per = 0.075;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 10000 && sells > 1000) {
                per = 0.10;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells > 10000) {
                per = 0.13;
                result = sells * per;
                System.out.printf("%.2f", result);
            }


        } else if (city.equals("plovdiv")) {
            if (sells < 0) {
                System.out.println("error");
            }else if (sells <= 500) {
                per = 0.055;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 1000 && sells > 500) {
                per = 0.08;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells <= 10000 && sells > 1000) {
                per = 0.12;
                result = sells * per;
                System.out.printf("%.2f", result);
            } else if (sells > 10000) {
                per = 0.145;
                result = sells * per;
                System.out.printf("%.2f", result);
            }


        } else System.out.println("error");
    }
}