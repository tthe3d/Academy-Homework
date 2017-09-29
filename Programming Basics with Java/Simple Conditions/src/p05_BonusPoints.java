import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p05_BonusPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        double number = Double.parseDouble(sc.nextLine());
        double bonus = 0;
        if (number <= 100){
            bonus = 5;
        }else if (number <= 1000){
            bonus = number * 0.2;
        }else bonus = number * 0.1;
        if (number % 10 == 5){
            bonus = bonus + 2;
        }else if (number % 2 == 0){
            bonus = bonus + 1 ;
        }
        System.out.println("Bonus : " + bonus);
        System.out.println("Number after bonus : " + (bonus + number));
    }
}
