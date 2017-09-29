using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p10_TriangleOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int pars = int.Parse(Console.ReadLine());

            for (int i = 1; i <= pars; i++)
            {
                for (int j = 0; j < i; j++)
                {
                    Console.Write($"{i} ");
                }
                Console.WriteLine();
            }
        }
    }
}
