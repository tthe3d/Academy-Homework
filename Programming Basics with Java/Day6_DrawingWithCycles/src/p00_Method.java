import java.util.Scanner;

public class p00_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

    }
    static String repeatString(String toRepeat, int count){
        String text = "";

        for(int i = 1 ; i <= count; i++){
            text += toRepeat;
        }
        return text;
    }
}
