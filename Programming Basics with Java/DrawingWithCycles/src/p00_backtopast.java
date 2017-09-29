import java.text.DecimalFormat;
import java.util.Scanner;

public class p00_backtopast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inheritance = Double.parseDouble(sc.nextLine());
        int year = 1800;
        double money = inheritance;
        int needyear = Integer.parseInt(sc.nextLine());
        int age = 18;
        for ( int i = 0; i <= needyear-year; i++){
            if (i % 2 == 0 ){
                money -= 12_000;
                age++;
            }else {
                money -=  (12_000 + (50 * age));
                age++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        if (money < 0){
            System.out.println("He will need " + df.format(Math.abs(money)) + " dollars to survive.");
        }else System.out.println("Yes! He will live a carefree life and will have " + df.format(Math.abs(money)) + " dollars left.");
    }
}
