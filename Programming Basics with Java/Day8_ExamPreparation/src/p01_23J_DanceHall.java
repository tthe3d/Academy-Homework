import java.util.Scanner;

public class p01_23J_DanceHall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L = Double.parseDouble(sc.nextLine());
        double W = Double.parseDouble(sc.nextLine());
        double A = Double.parseDouble(sc.nextLine());



        double skameika = ((L*W)/10)*100;

        double wardrobe = (A*A) * 100;

        double Hall = (L * W) * 100;

        double dancers = (Hall - wardrobe - skameika) / 7040;

        System.out.printf("%.0f",Math.floor(dancers*100));


    }
}
