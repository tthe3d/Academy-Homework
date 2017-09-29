import java.text.DecimalFormat;
import java.util.Scanner;

public class p11_OddEvenSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        double OddMin = Double.MAX_VALUE;
        double OddMax = -1000000000;
        double OddSum = 0;
        double EvenMin = Double.MAX_VALUE;
        double EvenMax = -1000000000;
        double EvenSum = 0;


        for (int i = 1; i <= n; i++) {
            double current = Double.parseDouble(sc.nextLine());
            if (i % 2 == 0) {
                EvenSum += current;
                if (current > EvenMax) {
                    EvenMax = current;
                }
                if (current < EvenMin) {
                    EvenMin = current;
                }
            } else if (i % 2 != 0) {
                OddSum += current;
                if (current > OddMax) {
                    OddMax = current;
                }
                if (current < OddMin) {
                    OddMin = current;
                }
            }
        }
        DecimalFormat format = new DecimalFormat("0.##");

        System.out.println("OddSum="+format.format(OddSum));
        if (OddMin == Double.MAX_VALUE){
            System.out.printf("%nOddmin=No");
        }else System.out.println("OddMin="+format.format(OddMin));
        if (OddMax == -1000000000){
            System.out.printf("%nOddMax=No");
        }else System.out.printf("OddMax="+format.format(OddMax));
        System.out.println("\n\nEvenSum="+format.format(EvenSum));
        if (EvenMin == Double.MAX_VALUE){
            System.out.printf("%nEvenMin=No");
        }else System.out.println("EvenMin="+format.format(EvenMin));
        if (EvenMax == -1000000000){
            System.out.printf("%nEvenMax=No");
        }else System.out.println("EvenMax="+format.format(EvenMax));
    }
}