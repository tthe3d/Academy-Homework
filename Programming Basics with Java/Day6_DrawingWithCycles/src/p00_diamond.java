import java.util.Scanner;

public class p00_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.print(repeatString(" ", (n*5)-(n*4)));
        System.out.print(repeatString("*", n*3));
        System.out.println(repeatString(" ",(n*5)-(n*4)));
        for (int i = 1; i < n ; i++){
            System.out.print(repeatString(" ", n - i));
            System.out.print("*");
            System.out.print(repeatString(" ", (n*3)+(2*i)-2));
            System.out.print("*");
            System.out.println(repeatString(" ", n - i));
        }
        System.out.println(repeatString("*", n*5));
        for (int i = 1 ; i < 2*n+1;i++){
            System.out.print(repeatString(" ", i));
            System.out.print("*");
            System.out.print(repeatString(" ",(n*5)-(2*i)-2));
            System.out.print("*");
            System.out.println(repeatString(" ", i));
        }
        System.out.print(repeatString(" ",n*2+1));
        System.out.print(repeatString("*", (n*5)-(n*4)-2));
        System.out.print(repeatString(" ",n*2+1));
    }
    static String repeatString (String toRepeat, int count ){
        String text = "";
        for (int i = 0 ; i < count ; i++){
            text += toRepeat;
        }
        return text;
    }
}