import java.util.Scanner;

public class p12_DoublesDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int currSum = 0;
        int prevSum = 0;
        int diff = 0;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            prevSum = currSum;
            currSum = 0;
            currSum += Integer.parseInt(sc.nextLine());
            currSum += Integer.parseInt(sc.nextLine());
            if (i != 0) {
                diff = Math.abs(currSum - prevSum);
                if (diff != 0 && diff > maxDiff) {
                    maxDiff = diff;
                }
            }

        }
        if (prevSum == currSum && maxDiff == 0 || n == 1) {
            System.out.printf("Yes, value=%d", currSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
