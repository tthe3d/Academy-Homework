import java.util.Scanner;

public class p11_cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int r = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        double type = 0;
        if(input.equals("premiere")){
           type = 12;
        }else if (input.equals("normal")){
            type = 7.5;
        }else if (input.equals("discount")){
            type = 5;
        }
        double result = type * r * k;
        System.out.printf("%.2f leva", result);
    }
}
