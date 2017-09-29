import java.util.Scanner;

public class p12_EDoItAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int currentSum = 0;
        int previousSum = 0;
        int diff = 0;
        int Maxdiff = 0;
        for(int i = 0; i < n; i++){
            previousSum = currentSum;
            currentSum = 0;
            currentSum += Integer.parseInt(sc.nextLine());
            currentSum += Integer.parseInt(sc.nextLine());
            if(i != 0){
                diff = Math.abs(currentSum - previousSum);
                if(diff > Maxdiff){
                    Maxdiff = diff;
                }
            }
        }
        if (currentSum == previousSum && Maxdiff == 0 || n == 1){
            System.out.printf("Yes, value=%d");
        }else System.out.printf("No, maxdiff=",Maxdiff);
    }
}
