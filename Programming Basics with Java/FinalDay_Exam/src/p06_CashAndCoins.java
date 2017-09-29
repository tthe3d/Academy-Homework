import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p06_CashAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coinC1 = Integer.parseInt(sc.nextLine());
        int coinC2 = Integer.parseInt(sc.nextLine());
        int cashC5 = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());
        int one = coinC1;
        int two = coinC2;
        int three = cashC5;

        for (int a = 0; a <=coinC1;a++){
            one = a * 1;
            for (int b = 0; b <= coinC2;b++){
                two = b * 2;
                for (int c = 0; c <= cashC5;c++){
                    three = c * 5;
                    if (one+two+three==sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",a,b,c,sum);
                    }
                }
            }
        }




    }
}
