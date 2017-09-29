import java.util.Scanner;

public class p04_fruitorvegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        if (input.equals("apple")||input.equals("banana")||input.equals("kiwi")
                ||input.equals("lemon")||input.equals("cherry")||input.equals("grapes")) {
            System.out.println("fruit");
        }else if (input.equals("water")||input.equals("beer")){
            //being lazy
            System.out.println("unknown");
        }else System.out.println("vegetable");
    }
}


