import java.util.Scanner;

public class p02_23J_Choreography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double steps = Double.parseDouble(sc.nextLine());
        double dancers = Double.parseDouble(sc.nextLine());
        double time = Double.parseDouble(sc.nextLine());

        double stepsperday = Math.ceil(((steps/time)/steps)*100);
        double percentperdancer = stepsperday/dancers;

        if (percentperdancer*dancers <= 13)
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.",percentperdancer);
        else System.out.printf("No, they will not succeed in that goal! Required %.2f%% steps to be learned per day.",percentperdancer);

    }
}
