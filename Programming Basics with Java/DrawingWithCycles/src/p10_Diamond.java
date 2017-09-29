import java.util.Scanner;

public class p10_Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int stars = 1;
        int midash = -1;

        if (n % 2 == 0){
            stars = 2;
            midash = 0;
        }

       int  dash = (n - stars) / 2;

        for(int i = 1; i < (n+1)/2 ; i++){
            System.out.print(repeatString("-",dash));
            System.out.print("*");

            if(midash >= 0) {
                System.out.print(repeatString("-", midash));
                System.out.print("*");
            }

            System.out.println(repeatString("-",dash));
            midash += 2;
            dash -=1;
        }

        for (int i = 0; i < (n+1)/2 ;i++) {
            System.out.print(repeatString("-", dash));
            System.out.print("*");

            if(midash >= 0) {
                System.out.print(repeatString("-", midash));
                System.out.print("*");
            }

            System.out.println(repeatString("-", dash));
            midash -= 2;
            dash += 1;
        }
    }
    static String repeatString(String toRepeat, int count) {
        String text = "";

        for (int i = 1; i <= count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
