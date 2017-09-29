import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p14_Number0to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        double number1 = 0;
        if (number == 1) {
            System.out.print("one");
        } else if (number == 2) {
            System.out.print("two");
        } else if (number == 3) {
            System.out.print("three");
        } else if (number == 4) {
            System.out.print("four");
        } else if (number == 5) {
            System.out.print("five");
        } else if (number == 6) {
            System.out.print("six");
        } else if (number == 7) {
            System.out.print("seven");
        } else if (number == 8) {
            System.out.print("eight");
        } else if (number == 9) {
            System.out.print("nine");
        } else if (number == 10) {
            System.out.print("ten");
        } else if (number == 0) {
            System.out.print("zero");
        } else if (number == 11) {
            System.out.print("eleven");
        } else if (number == 12) {
            System.out.print("twelve");
        } else if (number == 13) {
            System.out.print("thirteen");
        } else if (number == 14) {
            System.out.print("fourteen");
        } else if (number == 15) {
            System.out.print("fifteen");
        } else if (number == 16) {
            System.out.print("sixteen");
        } else if (number == 17) {
            System.out.print("seventeen");
        } else if (number == 18) {
            System.out.print("eighteen");
        } else if (number == 19) {
            System.out.print("nineteen");
        } else if (number == 20) {
            System.out.print("twenty");
        } else if (number == 30) {
            System.out.print("thirty");
        } else if (number == 40) {
            System.out.print("forty");
        } else if (number == 50) {
            System.out.print("fifty");
        } else if (number == 60) {
            System.out.print("sixty");
        } else if (number == 70) {
            System.out.print("seventy");
        } else if (number == 80) {
            System.out.print("eighty");
        } else if (number == 90) {
            System.out.print("ninety");
        } else if (number > 20 && number < 30) {
            System.out.print("twenty ");
            number1 = number - 20;
        } else if (number > 30 && number < 40) {
            System.out.print("thirty ");
            number1 = number - 30;
     } else if (number > 40 && number < 50) {
            System.out.print("forty ");
            number1 = number - 40;
        } else if (number > 50 && number < 60) {
            System.out.print("fifty ");
            number1 = number - 50;
        } else if (number > 60 && number < 70) {
            System.out.print("sixty ");
            number1 = number - 60;
        } else if (number > 70 && number < 80) {
            System.out.print("seventy ");
            number1 = number - 70;
        } else if (number > 80 && number < 90) {
            System.out.print("eighty ");
            number1 = number - 80;
        } else if (number > 90 && number < 100) {
            System.out.print("ninety ");
            number1 = number - 90;
        }
        if (number1 == 1) {
            System.out.print("one");
        } else if (number1 == 2) {
            System.out.print("two");
        } else if (number1 == 3) {
            System.out.print("three");
        } else if (number1 == 4) {
            System.out.print("four");
        } else if (number1 == 5) {
            System.out.print("five");
        } else if (number1 == 6) {
            System.out.print("six");
        } else if (number1 == 7) {
            System.out.print("seven");
        } else if (number1 == 8) {
            System.out.print("eight");
        } else if (number1 == 9) {
            System.out.print("nine");
        }else if (number == 100){
            System.out.print("one hundred");
        }else if (number < 0 || number > 100){
            System.out.print("invalid number");
        }
    }
}
