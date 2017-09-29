import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p03_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = Double.parseDouble(sc.nextLine());
        double number2 = Double.parseDouble(sc.nextLine());
        if (number1 > number2){
            System.out.print(number1);
        }else System.out.print(number2);
    }
}
