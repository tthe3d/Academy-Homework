import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/21/17.
 */
public class pBonus_Tom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tomhappy = 30000;
        int dinkowork = 63;
        int dinkohome = 127;
        int H = 0;
        int MIN = 0;
        int input = Integer.parseInt(sc.nextLine());
        int play = (input * dinkohome) + (365-input) * dinkowork;
        if(play >= 30000){
            MIN = (play - tomhappy);
            H = MIN / 60;
            MIN = MIN % 60;
            System.out.printf("Tom will run away \n%d hours and %d minutes more for play", H ,MIN);
        }else {
            MIN = (tomhappy - play);
            H = MIN / 60;
            MIN = MIN % 60;
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", H,MIN);
        }
    }
}
