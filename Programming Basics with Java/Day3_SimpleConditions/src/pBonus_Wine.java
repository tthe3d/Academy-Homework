import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/21/17.
 */
public class pBonus_Wine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.nextLine());
        double Y = Double.parseDouble(sc.nextLine());
        int Z = Integer.parseInt(sc.nextLine());
        int workers = Integer.parseInt(sc.nextLine());
        double kgWine = X * Y * 0.4;
        double litersWine = kgWine / 2.5;
        if(litersWine >= Z){
           double left = litersWine - Z;
           double leftperson =  left/workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person.",Math.floor(litersWine),Math.ceil(left),Math.ceil(leftperson));
        }else {
         double need =  Z - litersWine;
         System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(need));
        }
    }
}
