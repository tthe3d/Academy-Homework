import java.util.Scanner;

public class p04_23J_EnergyLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //calculations are shit
        double day = Double.parseDouble(sc.nextLine());
        double dancers = Double.parseDouble(sc.nextLine());

        double sum = 0;
        for (int i = 1; i <= day;i++) {
            double readNum = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0 && readNum % 2 == 0) {
                sum += dancers * 68;
            } else if (i % 2 != 0 && readNum % 2 == 0) {
                sum += dancers * 49;
            } else if (i % 2 == 0 && readNum % 2 != 0) {
                sum += dancers * 65;
            } else if (i % 2 != 0 && readNum % 2 != 0) {
                sum += dancers * 30;
            }
        }

        double totalEnergy = 100 * dancers * day;

        double EnergyLeft = totalEnergy - (sum);

        double EnergyLeftPerPersonForDay = EnergyLeft/dancers/day;

        if ( EnergyLeftPerPersonForDay < 50){
            System.out.printf("They are wasted! Energy left: %.2f" , EnergyLeftPerPersonForDay);
        }else if (EnergyLeftPerPersonForDay>=50){
            System.out.printf("They feel good! Energy left: %.2f" , EnergyLeftPerPersonForDay);
        }

    }
}
