import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by KungFuMaster on 7/16/17.
 */
public class p12_1000DaysFromBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter birth date : ");
        String bDay = sc.nextLine();
        LocalDate birthDay = LocalDate.parse(bDay,dateFormat).plusDays(999);
        System.out.print("On ");
        System.out.print(dateFormat.format(birthDay));
        System.out.print(" you make 1000 days since birth!");
    }
}
