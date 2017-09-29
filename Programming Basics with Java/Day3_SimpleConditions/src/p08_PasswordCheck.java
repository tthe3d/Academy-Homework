import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/18/17.
 */
public class p08_PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pswd = sc.nextLine();
        if (pswd.equals("s3cr3t!P@ssw0rd")){
            System.out.print("Welcome");
        }else System.out.print("Wrong password!");
    }
}
