import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p04_NumbersInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        if(number == 1){
            System.out.print("one");
        }
        else if(number == 2){
            System.out.print("two");
        }
        else if(number == 3){
            System.out.print("three");
        }
        else if(number == 4){
            System.out.print("four");
        }
        else if(number == 5){
            System.out.print("five");
        }
        else if(number == 6){
            System.out.print("six");
        }
        else if(number == 7){
            System.out.print("seven");
        }
        else if(number == 8){
            System.out.print("eight");
        }
        else if(number == 9){
            System.out.print("nine");
        }
        else if(number == 10){
            System.out.print("ten");
        }
        else if(number > 10){
            System.out.print("number too big");
        }else System.out.print("number too small");

    }
}
