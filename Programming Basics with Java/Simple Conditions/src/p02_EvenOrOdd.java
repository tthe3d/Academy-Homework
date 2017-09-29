import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p02_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        if (number % 2 == 0){
            System.out.print("even");
        }
        else System.out.print("odd");
    }
}
