import java.util.Scanner;

public class p13_BonusHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int till200 = 0;
        int till399 = 0;
        int till599 = 0;
        int till799 = 0;
        int over800 = 0;
        for (int i = 0 ; i < n; i++){
            int num = Integer.parseInt(sc.nextLine());
            if (num < 200){
                till200++;
            }else if(num < 400){
                till399++;
            }else if (num < 600){
                till599++;
            }else if (num < 800){
                till799++;
            }else over800++;
        }
        double allnum = till200+till399+till599+till799+over800;
        double p1 = till200 / allnum * 100;
        double p2 = till399 / allnum * 100;
        double p3 = till599 / allnum * 100;
        double p4 = till799 / allnum * 100;
        double p5 = over800 / allnum * 100;
        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);
    }
}
