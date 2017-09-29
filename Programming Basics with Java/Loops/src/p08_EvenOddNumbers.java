import java.util.Scanner;

public class p08_EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < n ; i++) {
            int element = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenNum += element;
            } else oddNum += element;
        }
            if (evenNum == oddNum){
                System.out.println("yes sum " + evenNum);
            }else System.out.println("no diff " + Math.abs(evenNum-oddNum));
        }
    }