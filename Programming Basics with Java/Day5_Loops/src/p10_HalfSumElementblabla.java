import java.util.Scanner;

public class p10_HalfSumElementblabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++){
            int haloo = Integer.parseInt(sc.nextLine());
            if (haloo > biggestNum){
                biggestNum = haloo;
            }
            sum += haloo;
        }
        if (sum - biggestNum == biggestNum){
            System.out.println("Yes Sum = " + biggestNum);
        }else System.out.println("No Diff = " + Math.abs((sum - biggestNum) - biggestNum));
    }
}
