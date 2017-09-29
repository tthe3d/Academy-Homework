import java.util.Scanner;

/**
 * Created by KungFuMaster on 9/3/17.
 */
public class p03_PhotoPictures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine().toLowerCase();
        String purchase = sc.nextLine().toLowerCase();
        double price = 0;

            if (type.equals("9x13")) {
                price = count * 0.16;
                if (count >= 50) {
                    price = price * 0.95;
                }

            } else if (type.equals("10x15")) {
                price = count * 0.16;
                if (count >= 80) {
                    price = price * 0.97;
                }
            } else if (type.equals("13x18")) {
                price = count * 0.38;
                if (count >= 50 && count <= 100) {
                    price = price * 0.97;
                } else if (count > 100) {
                    price = price * 0.95;
                }
            } else if (type.equals("20x30")) {
                price = count * 2.9;
                if (count >= 10 && count <= 50) {
                    price = price * 0.93;
                } else if (count > 50) {
                    price = price * 0.91;
                }
            }
            if (purchase.equals("online"))
            System.out.printf("%.2fBGN",price*0.98);
            else if (purchase.equals("office"))
                System.out.printf("%.2fBGN",price);
        }
    }