import java.util.Scanner;

public class p02_18M_WORKHOURS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int need = Integer.parseInt(sc.nextLine());
        int workers = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int jobdone = workers*days*8;

        int overtime = need - jobdone;

        if (overtime > 0){
            System.out.printf("%d overtime%n",overtime);
            System.out.printf("Penalties: %d",days*overtime);
        }else System.out.printf("%d hours left",Math.abs(overtime));
    }
}
