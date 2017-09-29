import java.util.Scanner;

public class p06_20N_PokemonBattles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int AshCatchem = Integer.parseInt(sc.nextLine());
        int JorjeJulio = Integer.parseInt(sc.nextLine());
        int maxBattles = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int a = 1; a <= AshCatchem;a++){
            for (int j = 1; j <= JorjeJulio;j++){
                count++;
                while (count<=maxBattles){
                    System.out.printf("(%d <-> %d) ",a,j);
                    break;
                }
            }
        }
    }
}
