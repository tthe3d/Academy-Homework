import java.util.Scanner;

public class p04_TriangleOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < n ; i++){
            System.out.print("$");
            for (int j = 0 ; j < i ; j++){
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}
