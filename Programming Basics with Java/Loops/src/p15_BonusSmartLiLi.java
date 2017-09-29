import java.util.Scanner;

public class p15_BonusSmartLiLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        double washmachine = Double.parseDouble(sc.nextLine());
        int toyprice = Integer.parseInt(sc.nextLine());
        double totalmoney = 0;
        int getmoney = 0;
        for (int i = 1; i <= age; i++){
            if (i % 2 != 0){
                totalmoney += toyprice;
            }else if (i % 2 == 0){
                getmoney += 10;
                totalmoney += getmoney;
                totalmoney -= 1;
            }
        }
        double diff = Math.abs(totalmoney - washmachine);
        if ( totalmoney >= washmachine){
            System.out.printf("Yes! %.2f", diff);
        }else System.out.printf("No! %.2f",diff);
    }
}
