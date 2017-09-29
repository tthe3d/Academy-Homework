import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p06_TotalSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(sc.nextLine());
        int secondPlayer = Integer.parseInt(sc.nextLine());
        int thirdPlayer = Integer.parseInt(sc.nextLine());
        int sec = firstPlayer + secondPlayer + thirdPlayer;
        int min = 0;
        if (sec > 179){
           System.out.print("Too slow.");
        }else if (sec > 119){
            min = min + 2;
            sec = sec - 120;
        }else if (sec > 59){
            min++;
            sec = sec - 60;
        }else if (sec <= 0){
            System.out.print("Nobody have run.");
        }
        if (sec < 10){
            System.out.println(min + ":0" + sec);

        }else System.out.println(min + ":" + sec);
    }
}
