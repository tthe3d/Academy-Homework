import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/21/17.
 */
public class pBonus_ToyShopExcurcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceTrip = Double.parseDouble(sc.nextLine());
        int puzzleC = Integer.parseInt(sc.nextLine());
        int talkingdollC = Integer.parseInt(sc.nextLine());
        int teddybearC = Integer.parseInt(sc.nextLine());
        int minionC = Integer.parseInt(sc.nextLine());
        int minitruckC = Integer.parseInt(sc.nextLine());
        int order = puzzleC + teddybearC + talkingdollC + minionC + minitruckC;
        double puzzle = puzzleC * 2.6;
        double teddybear = teddybearC * 4.1;
        double talkingdoll = talkingdollC * 3;
        double minion = minionC * 8.2;
        double minitruck = minitruckC * 2;
        double priceOrder = puzzle + teddybear + talkingdoll + minion + minitruck;
        if (order >= 50){
            priceOrder = priceOrder - (priceOrder*0.25);
            priceOrder = priceOrder - (priceOrder*0.1);
            if (priceOrder >= priceTrip){
                double Moneyleft = priceOrder - priceTrip;
                System.out.printf("Yes! %.2f lv left.",Moneyleft);
            }else {
                double Moneyneeded = priceTrip - priceOrder;
                System.out.printf("Not enough money! %.2f lv needed.",Moneyneeded);
            }
            }else {
            priceOrder = priceOrder - (priceOrder*0.1);
            if (priceOrder >= priceTrip){
                double Moneyleft = priceOrder - priceTrip;
                System.out.printf("Yes! %.2f lv left.",Moneyleft);
            }else {
                double Moneyneeded = priceTrip - priceOrder;
                System.out.printf("Not enough money! %.2f lv needed.",Moneyneeded);
            }

        }
    }
}
