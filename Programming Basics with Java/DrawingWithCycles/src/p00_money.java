import java.util.Scanner;

public class p00_money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bitcoin = Integer.parseInt(sc.nextLine());
        double yan = Double.parseDouble(sc.nextLine());
        double comission = Double.parseDouble(sc.nextLine());
        bitcoin *= 1168;
        bitcoin /= 1.95;
        yan *= 0.15;
        yan *= 1.76;
        yan /= 1.95;
        double euro = bitcoin + yan;
        euro = euro - (euro * (comission/100));
        System.out.println(euro);
    }
}
