using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace p04_SieveОfEratosthenes
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            var listOfNumbers = new int[n];
            var primes = new bool[n];

            for (int i = 1; i <= n; i++)
            {
                listOfNumbers[i-1] = i;
                if (listOfNumbers[i-1] % 2 == 0 || listOfNumbers[i-1] % 3 == 0 || listOfNumbers[i-1] % 5 == 0)
                    primes[i-1] = false;
                else primes[i-1] = true;
            }
            primes[0] = false;
            if (n>3)
            primes[2] = true;
            if(n>5)
            primes[4] = true;
            if (n >= 7)
                primes[6] = true;
            for (int i = 0; i < n; i++)
            {
                if (primes[i])
                {
                    int count = 0;
                    for (int j = 2; j <= listOfNumbers[i]; j++)
                    {
                        if (listOfNumbers[i] % j == 0)
                        {
                            count++;
                            if (count > 1)
                            primes[i] = false;
                        }
                    }
                }
            }
            string thePrimes = null;
            if (n >= 2)
                thePrimes = "2";
            else
            {
                thePrimes = "";
                return;
            }
            for (int i = 2; i < n; i++)
            {
                if (primes[i])
                    thePrimes += " " + listOfNumbers[i];
            }
            Console.WriteLine(thePrimes);


        }
    }
}