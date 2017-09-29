import java.util.Scanner;

public class p03_23J_FinalCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dancers = Double.parseDouble(sc.nextLine());
        double points = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine().toLowerCase();
        String place = sc.nextLine().toLowerCase();
        double percent = 0;
        double money = 0;

        if (season.equals("summer") && place.equals("bulgaria")) {
            percent = 0.95;
        }else if (season.equals("summer") && place.equals("abroad")){
            percent = 0.9;
        }else if (season.equals("winter") && place.equals("bulgaria")){
            percent = 0.92;
        }else if (season.equals("winter") && place.equals("abroad")){
            percent = 0.85;
        }

        if (place.equals("bulgaria")){
            money = (dancers * points) * percent;
        }else if (place.equals("abroad")){
            money = ((dancers * points) * 1.5)*percent;
        }
        double charity = money * 0.75;
        money *= 0.25;
        System.out.printf("Charity - %.2f%n",charity);
        System.out.printf("Money per dancer - %.2f", money/dancers);

    }
}
