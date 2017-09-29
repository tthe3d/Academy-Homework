import java.util.Scanner;

public class p13_STOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int dot = n + 1;
        int dash = n * 2 + 1;
        int width = (2 * (n + 1)) + (n * 2 + 1);

        System.out.print(repeatString(".", dot));
        System.out.print(repeatString("_", dash));
        System.out.println(repeatString(".", dot));
        dot--;
        dash -= 2;

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", dot));
            System.out.print("//");
            System.out.print(repeatString("_", dash));
            System.out.print("\\\\");
            System.out.println(repeatString(".", dot));
            dot--;
            dash += 2;
        }
        System.out.print("//");
        System.out.print(repeatString("_", (dash - 5) / 2));
        System.out.print("STOP!");
        System.out.print(repeatString("_", (dash - 5) / 2));
        System.out.println("\\\\");

        for (int i = 0; i < n; i++) {
            System.out.print(repeatString(".", dot));
            System.out.print("\\\\");
            System.out.print(repeatString("_", dash));
            System.out.print("//");
            System.out.println(repeatString(".", dot));
            dot++;
            dash -= 2;


        }
    }
    static String repeatString(String toRepeat,int count){
        String text = "";
        for ( int i = 0; i < count;i++){
            text+=toRepeat;
        }
        return text;
    }
}
    /*

    3
        ...._______....
        ...//_____\\...
        ..//_______\\..
        .//_________\\.
        //___STOP!___\\
        \\___________//
        .\\_________//.
        ..\\_______//..


6
......._____________.......
......//___________\\......
.....//_____________\\.....
....//_______________\\....
...//_________________\\...
..//___________________\\..
.//_____________________\\.
//_________STOP!_________\\
\\_______________________//
.\\_____________________//.
..\\___________________//..
...\\_________________//...
....\\_______________//....
.....\\_____________//.....


7
........_______________........
.......//_____________\\.......
......//_______________\\......
.....//_________________\\.....
....//___________________\\....
...//_____________________\\...
..//_______________________\\..
.//_________________________\\.
//___________STOP!___________\\
\\___________________________//
.\\_________________________//.
..\\_______________________//..
...\\_____________________//...
....\\___________________//....
.....\\_________________//.....
......\\_______________//......









        **/