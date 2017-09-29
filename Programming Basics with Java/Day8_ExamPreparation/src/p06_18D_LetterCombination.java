import java.util.Scanner;

public class p06_18D_LetterCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();
        String except = sc.nextLine();
        int count = 0;

        for (int a = first.charAt(0); a <= second.charAt(0);a++){
            for (int b = first.charAt(0); b <= second.charAt(0);b++){
                for (int c = first.charAt(0); c <= second.charAt(0);c++){
                    if(a != except.charAt(0) && b != except.charAt(0) && c != except.charAt(0)){
                        count++;
                        System.out.printf("%c%c%c ",a,b,c);
                    }
                }
            }
        }
        System.out.print(count);
    }
}
