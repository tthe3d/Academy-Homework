import java.util.Scanner;

public class blaksboadfk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 1000000;

        int t1 = Integer.parseInt(sc.nextLine());
        int t2 = Integer.parseInt(sc.nextLine());
        int t3 = Integer.parseInt(sc.nextLine());

        // Calculate all Tribonacci numbers in the range [1 ... 1 000 000]
        boolean[] trib = new boolean[MAX+1];
        trib[t1] = true;
        trib[t2] = true;
        trib[t3] = true;
        while (true)
        {
            int tNext = t3 + t2 + t1;
            if (tNext <= MAX)
            {
                trib[tNext] = true;
            }
            else
            {
                // The end of the range is reached
                break;
            }
            t1 = t2;
            t2 = t3;
            t3 = tNext;
        }

        // Calculate all spiral numbers in the range [1 ... 1 000 000]
        long corner = Long.parseLong(sc.nextLine());
        long step = Long.parseLong(sc.nextLine());
        boolean oddCorner = true;
        long side = 0;
        boolean[] spiral = new boolean[MAX + 1];
        while (corner <= MAX)
        {
            spiral[(int) Math.toIntExact(corner)] = true;
            if (oddCorner)
            {
                side += 1;
            }
            corner += side * step;
            oddCorner = !oddCorner;
        }

        // Find the smallest common number
        for (int num = 1; num <= MAX; num++)
        {
            if (trib[num] && spiral[num])
            {
                System.out.println(num);
                return;
            }
        }

        System.out.println("No");
    }
}
