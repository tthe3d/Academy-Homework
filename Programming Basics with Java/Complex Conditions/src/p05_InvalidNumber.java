import java.util.Scanner;

public class p05_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        if(input>=100 && input<=200 || input == 0){
            System.out.println();
        }else System.out.println("invalid");
    }
}
