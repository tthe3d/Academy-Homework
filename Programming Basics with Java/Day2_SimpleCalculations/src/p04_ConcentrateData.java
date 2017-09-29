import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/15/17.
 */
public class p04_ConcentrateData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Your first name : ");
        String firstName = sc.nextLine();
        System.out.print("\n Your last name : ");
        String lastName = sc.nextLine();
        System.out.print("\n Your age : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("\n Your town : ");
        String town = sc.nextLine();
        System.out.printf("You are %s %s, a %d years old person, from %s.",firstName, lastName, age, town);
    }
}
