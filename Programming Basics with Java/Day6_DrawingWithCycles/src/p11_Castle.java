import java.util.Scanner;

public class p11_Castle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int eyes = n/2;

        int width = 2*n;

        System.out.print("/");
        System.out.print(repeatString("^",eyes ));
        System.out.print("\\");
        if (n > 4){
            System.out.print(repeatString("_",width-((2*eyes)+4)));
        }
        System.out.print("/");
        System.out.print(repeatString("^",eyes ));
        System.out.println("\\");

        for (int i = 0 ; i < n-3;i++){
            System.out.print("|");
            System.out.print(repeatString(" ",n*2-2));
            System.out.println("|");

        }
        System.out.print("|");
        System.out.print(repeatString(" ",eyes+1));
        if(n>4)
            System.out.print(repeatString("_",width-((2*eyes)+4)));
        System.out.print(repeatString(" ",eyes+1));
        System.out.println("|");

        System.out.print("\\");
        System.out.print(repeatString("_",eyes));
        System.out.print("/");
        System.out.print(repeatString(" ",width-((2*eyes)+4)));
        System.out.print("\\");
        System.out.print(repeatString("_",eyes));
        System.out.print("/");

    }
    static String repeatString(String toRepeat,int count){
        String text = "";

        for(int i = 0; i < count;i++){
            text += toRepeat;
        }
        return text;
    }
}