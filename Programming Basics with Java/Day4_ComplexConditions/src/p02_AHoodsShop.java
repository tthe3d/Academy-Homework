import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/22/17.
 */
public class p02_AHoodsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine().toLowerCase();
        String city = sc.nextLine().toLowerCase();
        double quantity = Double.parseDouble(sc.nextLine());
            if (city.equals("sofia")){
                switch (product){
                    case "coffee":
                        System.out.print(0.5 * quantity);
                        break;
                    case "water":
                        System.out.print(0.8 * quantity);
                        break;
                    case "beer":
                        System.out.print(1.2 * quantity);
                        break;
                    case "sweets":
                        System.out.print(1.45 * quantity);
                        break;
                    case "peanuts":
                        System.out.print(1.6 * quantity);
                        break;
                }
        }else if (city.equals("plovdiv")){
                switch (product){
                    case "coffee":
                        System.out.print(0.4 * quantity);
                        break;
                    case "water":
                        System.out.print(0.7 * quantity);
                        break;
                    case "beer":
                        System.out.print(1.15 * quantity);
                        break;
                    case "sweets":
                        System.out.print(1.3 * quantity);
                        break;
                    case "peanuts":
                        System.out.print(1.5 * quantity);
                        break;
                }
            }else if (city.equals("varna")){
                switch (product){
                    case "coffee":
                        System.out.print(0.45 * quantity);
                        break;
                    case "water":
                        System.out.print(0.7 * quantity);
                        break;
                    case "beer":
                        System.out.print(1.1 * quantity);
                        break;
                    case "sweets":
                        System.out.print(1.35 * quantity);
                        break;
                    case "peanuts":
                        System.out.print(1.55 * quantity);
                        break;
                }
            }else System.out.print("Unknown city.");

    }
}
