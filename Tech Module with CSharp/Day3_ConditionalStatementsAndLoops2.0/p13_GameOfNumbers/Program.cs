using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p13_GameOfNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int magik = int.Parse(Console.ReadLine());

            int lasta = 0;
            int lastb = 0;
            bool found = false;
            int combinations = 0;

            for (int i = a; i <= b; i++)
            {
                for (int j = a; j <= b; j++)
                {
                    combinations++;
                    if (i + j == magik)
                    {
                        lasta = i;
                        lastb = j;
                        found = true;
                    }
                }
            }
            if (found == true)
                Console.WriteLine($"Number found! {lasta} + {lastb} = {magik}");
            else Console.WriteLine($"{combinations} combinations - neither equals {magik}");
        }
    }
}
