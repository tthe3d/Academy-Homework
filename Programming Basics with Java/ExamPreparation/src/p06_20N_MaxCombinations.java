import java.util.Scanner;

public class p06_20N_MaxCombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int max = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int i = start;i <= end;i++){
            for (int x = start;x <= end;x++){
                count++;
                while(count <= max){
                    System.out.printf("<%d-%d>",i,x);
                    break;
                }
            }
        }
    }
}
