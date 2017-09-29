using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p06_MilesToKilometers
{
    class Program
    {
        static void Main(string[] args)
        {
            var km = double.Parse(Console.ReadLine());
            var miles = km * 1.60934;
            Console.WriteLine($"{miles:F2}");
        }
    }
}
