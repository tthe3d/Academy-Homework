using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace p16_Comparedoubles
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = double.Parse(Console.ReadLine());
            double b = double.Parse(Console.ReadLine());

            bool differenceIsOk = true;


            if (Math.Abs(a - b) >= 0.000001)
            {
                differenceIsOk = false;
                Console.WriteLine(differenceIsOk);
            }
            else
                Console.WriteLine(differenceIsOk);
        }
    }
}
