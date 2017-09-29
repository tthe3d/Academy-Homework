import java.util.Scanner;

public class p06_07M_NumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        int L = Integer.parseInt(sc.nextLine());
        int S = Integer.parseInt(sc.nextLine());
        int K = Integer.parseInt(sc.nextLine());

        int number = M * 100 + N * 10 + L;

        boolean number0 = true;

        int damit = M * 100 + N * 10 + L;

        if (number < 111)
            number0 = false;


        while (S < K && number0 == true) {


            // current M L N
            int numM = (int) Math.floor(number / 100);
            int numN = (int) (Math.floor(number - numM * 100 - (number % 10)) / 10);
            int numL = (int) Math.floor(number % 10);
            int numNum = numM * 100 + numN * 10 + numL;

            if (number > 111)
                number0 = true;
            else number0 = false;


            if (numM != 0 && numN != 0 && numL != 0) {
                if (number % 3 == 0) {
                    S += 5;
                } else if (number % 10 == 5 || number == 5) {
                    S -= 2;
                } else if (number % 2 == 0) {
                    S *= 2;
                }
                number--;
            } else if (numN == 0) {
                number = damit - 100;
                damit -= 100;
            } else{
                number -= (10-L);
            }
        }
        if (S >= K)
            System.out.println("Yes! Control number was reached! Current special number is " + S + ".");
        else
            System.out.println("No! " + S + " is the last reached special number.");
    }
}
