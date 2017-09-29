import java.util.Scanner;

public class p00_exampleRamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("+");
        for (int i = 0 ; i < n - 2; i++){
            System.out.print(" -");
        }
        System.out.println(" +");
        for (int j = 0 ; j < n - 2; j++) {
            System.out.print("|");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }
        System.out.print("+");
        for (int i = 0 ; i < n - 2; i++){
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
