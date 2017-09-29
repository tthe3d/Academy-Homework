import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p01_checkExcellentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double note = Double.parseDouble(sc.nextLine());
        if (note > 6 ) {
            System.out.print("Wrong Note.");
        }else if(note >= 5.5) {
            System.out.print("Excellent!");
        }else if (note > 6 ) {
            System.out.print("Wrong Note.");
        }else if (note < 2) {
            System.out.print("Wrong Note.");
        }else System.out.print("Not Excellent.");
        }
    }