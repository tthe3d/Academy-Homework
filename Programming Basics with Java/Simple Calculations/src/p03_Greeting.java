import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p03_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name?");
        System.out.print("\n Name : ");
        String name = sc.nextLine();
        System.out.printf("Hello, %s." , name);
    }
}
