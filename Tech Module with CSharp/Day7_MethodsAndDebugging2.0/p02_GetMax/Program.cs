using System;

namespace p02_GetMax
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int getNum1 = int.Parse(Console.ReadLine());
            int getNum2 = int.Parse(Console.ReadLine());
            int getNum3 = int.Parse(Console.ReadLine());
            int biggest = GetMax(getNum1, getNum2, getNum3);
            Console.WriteLine(biggest);
        }
        static int GetMax(int a, int b, int c)
        {
            if (a >= b && a >= c || (a > b && a > c)
               || (a > b && a >= c) || (a >= b && a > c))
                return a;
            else if (b >= a && b >= c || (b > a && b > c)
                     || (b > a && b >= c) || (b >= a && b > c))
                return b;
            else if (c >= a && c >= b || (c > a && c > b)
                     || (c > a && c >= b) || (c >= a && c > b))
                return c;
            else return 0;
        }
    }
}