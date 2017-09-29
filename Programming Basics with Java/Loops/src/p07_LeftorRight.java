import java.util.Scanner;

public class p07_LeftorRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;


        for (int i = 0; i < n ; i++){
            leftSum += Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < n ; i++) {
            rightSum += Integer.parseInt(sc.nextLine());
        }
        if(rightSum - leftSum == 0){
            System.out.println("Yes, Sum = " + leftSum);
        }else System.out.println("No, diff = " + Math.abs(rightSum - leftSum));


    }
}
