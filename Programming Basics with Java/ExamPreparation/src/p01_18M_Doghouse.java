import java.util.Scanner;

public class p01_18M_Doghouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        double side = a * (a/2);
        double back = (a/2) * (a/2) + (((a/2) * (b - (a/2)))/2);
        double front = back - (a/5)*(a/5);
        double roof = 2 * (a*(a/2));


        double green = (2 * side + back + front)/3;
        double red = (roof)/5;

        System.out.printf("%.2f%n",green);
        System.out.printf("%.2f",red);
    }
}
