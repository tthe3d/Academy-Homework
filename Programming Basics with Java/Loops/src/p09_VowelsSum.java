import java.util.Scanner;

public class p09_VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length();i++) {
            switch (input.charAt(i)) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println("Vowels sum = " +sum );
    }
}
