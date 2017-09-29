import java.util.Scanner;

public class p06_28A_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wholeNUMBA = Integer.parseInt(sc.nextLine());
        int newNUMBA = 0;
        int first = wholeNUMBA / 100;
        int second = (int) ((wholeNUMBA - (Math.floor(wholeNUMBA / 100) * 100)) - (wholeNUMBA % 10)) / 10;
        int third = wholeNUMBA % 10;
        for (int abc = first + second; abc >= 1; abc--) {
            for (int i = first + third; i >= 1; i--) {
                if (wholeNUMBA % 5 == 0) {
                    wholeNUMBA -= first;
                    System.out.print(wholeNUMBA + " ");
                } else if (wholeNUMBA % 3 == 0) {
                    wholeNUMBA -= second;
                    System.out.print(wholeNUMBA + " ");
                } else {
                    wholeNUMBA += third;
                    System.out.print(wholeNUMBA + " ");
                }
            }
            System.out.println();
        }
    }
}