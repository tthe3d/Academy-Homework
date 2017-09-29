using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p01_Passed
{
    class Program
    {
        static void Main(string[] args)
        {
            double health = double.Parse(Console.ReadLine());

            if (health >= 3.0)
                Console.WriteLine("Passed!");
        }
    }
}
