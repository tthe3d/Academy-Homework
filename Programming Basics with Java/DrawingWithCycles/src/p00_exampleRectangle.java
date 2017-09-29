import java.util.Scanner;

public class p00_exampleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int r = 0;r < n; r++){
            System.out.print("*");
            for(int c = 0; c < n - 1; c++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
