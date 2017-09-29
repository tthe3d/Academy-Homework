import java.text.DecimalFormat;
import java.util.Scanner;

public class Bonus_borsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vegetableprice = Double.parseDouble(sc.nextLine());
        double fruitprice = Double.parseDouble(sc.nextLine());
        double vegetablekg = Double.parseDouble(sc.nextLine());
        double fruitkg = Double.parseDouble(sc.nextLine());
        double moneylv = vegetableprice * vegetablekg + fruitprice * fruitkg;
        double moneyeur = moneylv / 1.94;
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(moneyeur));
    }
}
