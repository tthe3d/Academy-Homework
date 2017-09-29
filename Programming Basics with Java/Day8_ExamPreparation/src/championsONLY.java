import java.util.Scanner;

public class championsONLY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());
        int one = Integer.parseInt(sc.nextLine());
        int two = Integer.parseInt(sc.nextLine());
        int control = two;
        int currentF = n1+n2+n3;
        int currentS = one;
        while (currentF != currentS && currentF <= 1000000 && currentS <= 1000000) {
        while (currentS < currentF && currentS != n1 && currentS != n2 && currentS != n3) {
            currentS += two;
            if (currentS == one + (2 * two)) {
                two += control;
                one = currentS;
            }
        }
            while (currentF < currentS) {
                currentF = n1 + n2 + n3;
                n1 = n2;
                n2 = n3;
                n3 = currentF;
            }
            if (currentF != 0) {
                if (n1 == currentS || n2 == currentS || n3 == currentS || currentF == currentS) {
                    System.out.println(currentS);
                    return;
                }
            }
        }
        if (currentF>1000000 || currentS>1000000){
            System.out.println("No");
        }
    }
}