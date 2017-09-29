import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p10_SpeedTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = Double.parseDouble(sc.nextLine());
        if (speed <= 10){
            System.out.print("slow");
        }else if (speed <= 50){
            System.out.print("average");
        }else if (speed <= 150){
            System.out.print("fast");
        }else if (speed <= 1000){
            System.out.print("ultra fast");
        }else System.out.print("extremely fast");
    }
}
