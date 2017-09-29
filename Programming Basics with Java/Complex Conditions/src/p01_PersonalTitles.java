import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/22/17.
 */
public class p01_PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String MorF = sc.nextLine();
        if (age>=16){
            switch (MorF){
                case "m":
                 System.out.print("Mr.");
                 break;
                case "f":
                    System.out.print("Ms.");
                    break;
            }
        }else if (age<16){
            switch (MorF) {
                case "m":
                    System.out.print("Master");
                    break;
                case "f":
                    System.out.print("Miss");
                    break;
            }
        }
    }
}
