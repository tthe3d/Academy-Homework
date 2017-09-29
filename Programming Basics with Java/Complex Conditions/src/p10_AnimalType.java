import java.util.Scanner;

public class p10_AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String animal = null;
        if (input.equals("dog")){
            animal = "mammal";
        }else if (input.equals("crocodile")||input.equals("tortoise")||input.equals("snake")){
            animal = "reptile";
        }else System.out.println("unknown");
        System.out.println(animal);
    }
}
