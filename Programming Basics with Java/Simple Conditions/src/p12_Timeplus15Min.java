import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p12_Timeplus15Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputHour = Integer.parseInt(sc.nextLine());
        int inputMinute = Integer.parseInt(sc.nextLine());
        int Hour = 0;
        int Minute = 0;
        if(inputHour >= 0 && inputHour <= 23){
            Hour = Hour + inputHour;
        }
        if(inputMinute >= 0 && inputMinute <= 59){
            Minute = inputMinute + Minute + 15;
        }
        if (Minute >= 60){
            Hour++;Minute = Minute - 60;
        }
        if (Hour >=24){
            Hour = 0;
        }
        if (Minute < 10){
            System.out.printf("%d:0%d", Hour , Minute);
        }else System.out.printf("%d:%d", Hour, Minute);
    }
}
