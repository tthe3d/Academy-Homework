using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace p13_Factorial
{
    class Program
    {
        static void Main(string[] args)
        {
            BigInteger n = BigInteger.Parse(Console.ReadLine());
            BigInteger factorial = FindFactorial(n);
            bool stop = false;
            BigInteger checkForTrailingZeros = factorial;
            short trailingZeros = 0;
            while (stop == false)
            {
                if (checkForTrailingZeros % 10 > 0)
                    stop = true;
                else
                {
                    checkForTrailingZeros /= 10;
                    trailingZeros++;
                }
            }
            Console.WriteLine(trailingZeros);
        }

        static BigInteger FindFactorial(BigInteger n)
        {
            for (BigInteger i = n-1; i >= 1 ; i--)
            {
                n *= i;
            }
            return n;
        }
    }
}
