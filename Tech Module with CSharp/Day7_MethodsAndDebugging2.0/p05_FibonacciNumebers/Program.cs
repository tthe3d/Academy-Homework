using System;

namespace p05_FibonacciNumebers
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(GetFibonacci(n));
        }
        static int GetFibonacci(int n)
        {
            int a = 1;
            int b = 1;
            int fibonacci = 0;
            if (n == 0 || n == 1)
                return a;
            else
            {
                for (int i = 1; i < n; i++)
                {
                    fibonacci = a + b;
                    a = b;
                    b = fibonacci;
                }
                return fibonacci;
            }
        }
    }
}
