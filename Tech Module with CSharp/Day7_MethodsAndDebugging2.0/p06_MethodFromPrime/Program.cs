using System;

namespace p06_MethodFromPrime
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            Console.WriteLine(IsPrime(n));
        }
        static bool IsPrime (long n)
        {
            if (n == 0 || n == 1)
                return false;
            byte check = 0;
            for (int i = 1; i <= Math.Sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    check++;
                }
            }
            if (check >= 2)
                return false;
            else return true;
        }
    }
}
