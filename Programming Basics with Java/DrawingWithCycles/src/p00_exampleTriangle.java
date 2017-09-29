import java.util.Scanner;

public class p00_exampleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int row = 0; row < n; row++){
            System.out.print("$");
            for ( int col = 0; col < row; col++){
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
