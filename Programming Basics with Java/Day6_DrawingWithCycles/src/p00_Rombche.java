import java.util.Scanner;

public class p00_Rombche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int row = 0 ; row < n ; row++){
            for (int col = 0; col < n-row; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n; i < 0; i--){
            for (int j = 0; j <= n - i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for ( int j = 0; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
