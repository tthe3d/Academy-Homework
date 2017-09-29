import java.util.Scanner;

public class p13_Dot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int firstx1 = 0;
        int firsty1 = 0;
        int firstx2 = h * 3;
        int firsty2 = h;
        int secondx1 = h;
        int secondy1 = 0;
        int secondx2 = h * 2;
        int secondy2 = h * 4;
        if (((x > firstx1 && x < firstx2) && (y > firsty1 && y < firsty2))
                || ((x > secondx1 && x < secondx2) && (y > secondy1 && y < secondy2))) {
            System.out.println("inside");
        } else if ((((x == firstx1 || x == firstx2) && (y >= firsty1 && y <= firsty2))
                || ((y == firsty1 || y == firsty2) && (x >= firstx1 && x <= firstx2)))
                || (((x == secondx1 || x == secondx2) && (y >= secondy1 && y <= secondy2))
                || ((y == secondy1 || y == secondy2) && (x >= secondx1 && x <= secondx2)))) {
            System.out.println("border");
        }else System.out.println("outside");
    }
}