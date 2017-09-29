import java.util.Scanner;

public class p12_Volleyball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double p = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());
        double weekend = 48;
        double playdays = (weekend - h) * 3 / 4;
        double fiesta = p * 2/3;
        double all = playdays + h + fiesta;
        if (input.equals("leap")){
            all = all * 1.15;
        }
        System.out.printf("%.0f", Math.floor(all));
    }
}
