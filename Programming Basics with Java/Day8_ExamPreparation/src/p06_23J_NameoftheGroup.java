import java.util.Scanner;

public class p06_23J_NameoftheGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();
        String four = sc.nextLine();
        int five = Integer.parseInt(sc.nextLine());
        int num = 0;

        for (char onee = 65; onee <= one.charAt(0);onee++){
            for (char twoo = 97; twoo <= two.charAt(0);twoo++){
                for (char thri = 97; thri <= three.charAt(0);thri++){
                    for (char forr = 97; forr <= four.charAt(0);forr++){
                        for (int fiv = 0; fiv <= five;fiv++){
                            num++;
                        }
                    }
                }
            }
        }
        System.out.println(num-1);
    }
}