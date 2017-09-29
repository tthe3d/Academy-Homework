import java.util.Scanner;

public class p09_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        switch (day){
            case 1:
                day = 1;
                System.out.println("Monday");
                break;
            case 2:
                day = 2;
                System.out.println("Tuesday");
                break;
            case 3:
                day = 3;
                System.out.println("Wednesday");
                break;
            case 4:
                day = 4;
                System.out.println("Thursday");
                break;
            case 5:
                day = 5;
                System.out.println("Friday");
                break;
            case 6:
                day = 6;
                System.out.println("Saturday");
                break;
            case 7:
                day = 7;
                System.out.println("Sunday");
                break;
        }if (day > 7 || day < 1){
            System.out.println("Error");
        }
    }
}
