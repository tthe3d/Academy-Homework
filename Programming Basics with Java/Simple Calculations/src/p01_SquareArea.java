import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p01_SquareArea {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int side = Integer.parseInt(sc.nextLine());
        System.out.println(side * side);
    }
}
