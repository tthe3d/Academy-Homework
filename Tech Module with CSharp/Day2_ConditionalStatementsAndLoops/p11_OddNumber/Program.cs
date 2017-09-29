using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p11_OddNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            while (Math.Abs(num) % 2 != 1)
            {
                Console.WriteLine("Please write an odd number.");
                num = int.Parse(Console.ReadLine());
            }
            if (Math.Abs(num) % 2 == 1)
            {
                Console.WriteLine("The number is: " + Math.Abs(num));
            }
        }
    }
}
