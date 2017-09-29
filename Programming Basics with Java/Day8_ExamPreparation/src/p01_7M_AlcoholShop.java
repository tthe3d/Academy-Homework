import java.util.Scanner;

public class p01_7M_AlcoholShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double whiskey = Double.parseDouble(sc.nextLine());
        double beerL = Double.parseDouble(sc.nextLine());
        double wineL = Double.parseDouble(sc.nextLine());
        double rakiaL = Double.parseDouble(sc.nextLine());
        double whiskeyL = Double.parseDouble(sc.nextLine());


        double priceW = whiskeyL * whiskey;
        double priceR = rakiaL * (whiskey/2);
        double priceWi = wineL*((whiskey/2)-(0.4*(whiskey/2)));
        double priceB =beerL * ((whiskey/2)-(0.8*(whiskey/2)));
        double total = priceB+priceR+priceW+priceWi;
        System.out.printf("%.2f",total);

    }
}
