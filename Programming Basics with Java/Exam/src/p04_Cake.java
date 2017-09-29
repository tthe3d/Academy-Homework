import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p04_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = Integer.parseInt(sc.nextLine());
        int W = Integer.parseInt(sc.nextLine());
        int eaten = 0;
        while (eaten <= L*W){
            String input = sc.nextLine().toLowerCase();
            if(!input.equals("stop")) {
                int foo = Integer.parseInt(input);
                eaten += foo;
            }else if (input.equals("stop")){
                break;
            }
        }

        if ((L*W)-eaten >= 0){
            System.out.printf("%d pieces are left.",(L*W)-eaten);
        }else
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs((L*W)-eaten));

    }
}
