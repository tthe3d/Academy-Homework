import java.util.Scanner;

public class p0_progbasiclast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int a = 1 ; a <= 9; a++){
            for (int b = 1 ; b <= 9; b++){
                for (int c = 1 ; c <= 9 ; c++){
                    for (int d = 1 ; d <= 9; d++){
                        if (n%a==0&&n%b==0&&n%c==0&&n%d==0){
                            System.out.printf("%d%d%d%d ",a , b , c, d);
                        }
                    }
                }
            }
        }
    }
}
