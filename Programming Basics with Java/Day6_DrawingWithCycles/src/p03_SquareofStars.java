import java.util.Scanner;

public class p03_SquareofStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for ( int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
