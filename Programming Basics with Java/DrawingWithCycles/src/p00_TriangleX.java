import java.util.Scanner;

public class p00_TriangleX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int dot = 0;
        int start = (n*4)+1;
        int pause = (n*4)+1;
        int space = -1;

        System.out.println(repeatString("#",pause));
        space += 2 ;
        dot++;
        pause = n*2-1;

        for (int i = 0 ; i < n;i++) {
            System.out.print(repeatString(".",dot));
            System.out.print(repeatString("#",pause));


            if(i == n/2) {
                System.out.print(repeatString(" ", (start - (2*pause+2*dot+3))/2));
                System.out.print("(@)");
                System.out.print(repeatString(" ", ((start - (2*pause+2*dot+3))/2)));



            }else System.out.print(repeatString(" ",space));
                System.out.print(repeatString("#",pause));
            System.out.println(repeatString(".",dot));
            dot++;
            space += 2;
            pause -= 2;

        }
        pause = start -2*dot;
        for (int i = 0 ; i < n;i++) {
            System.out.print(repeatString(".",dot));
            System.out.print(repeatString("#",pause));
            System.out.println(repeatString(".",dot));
            dot++;
            pause -= 2;
        }


    }
    static String repeatString(String toRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += toRepeat;
        }
        return text;
    }
}
/*
#####################
.######### #########.
..#######   #######..
...##### (@) #####...
....###       ###....
.....#         #.....
......#########......
.......#######.......
........#####........
.........###.........
..........#..........
#################################
.############### ###############.
..#############   #############..
...###########     ###########...
....#########       #########....
.....#######   (@)   #######.....
......#####           #####......
.......###             ###.......
........#               #........
.........###############.........
..........#############..........
...........###########...........
............#########............
.............#######.............
..............#####..............
...............###...............
................#................
 */