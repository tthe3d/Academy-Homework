import java.util.Scanner;

public class p17_PoolPipes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //inputvariables
        int V = Integer.parseInt(scanner.nextLine()); //volume of pool in litres
        int P1 = Integer.parseInt(scanner.nextLine()); // 1st pipe debit per hour
        int P2 = Integer.parseInt(scanner.nextLine()); //2nd pipe debit per hour
        String H = scanner.nextLine();
        double hToDouble = Double.parseDouble(H);

        //customvariables
        double currentV = P1*hToDouble + P2*hToDouble;


        if (V >= currentV) {
            double percent = (currentV / V) * 100;
            double percentP1 = ((P1*hToDouble) / currentV) * 100;
            double percentP2 = ((P2*hToDouble) / currentV) * 100;
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor(percent), Math.floor(percentP1), Math.floor(percentP2));
        } else if (V < currentV){
            double overflow = currentV - V;
            System.out.printf("For %s hours the pool overflows with %.1f liters.", H, overflow);
        }

    }
}