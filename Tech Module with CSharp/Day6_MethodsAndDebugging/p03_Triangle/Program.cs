using System;

namespace p03_Triangle
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for (int i = 1; i < n; i++)
            {
                PrintNumber(1,i);
            }
            for (int j = n; j >= 1; j--)
            {
                PrintNumber(1,j);
            }
        }
        static void PrintNumber(int start,int end)
        {
            for (int i = start; i <= end; i++)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine();
        }
    }
}
