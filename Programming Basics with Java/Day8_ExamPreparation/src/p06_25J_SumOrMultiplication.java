import java.util.Scanner;

public class p06_25J_SumOrMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int xaxa = 0;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {

                    if (a < b && b < c){
                        if (a+b+c==N){
                            System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
                            xaxa++;
                        }
                    }
                    if (a > b && b > c){
                        if (a*b*c==N){
                            System.out.println(a + " * " + b + " * " + c + " = " + (a*b*c));
                            xaxa++;
                        }
                    }


                }
            }
        }
        if (xaxa == 0){
            System.out.println("No!");
        }
    }
}