using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p05_RectangleArea
{
    class Program
    {
        static void Main(string[] args)
        {
            var one = double.Parse(Console.ReadLine());
            var two = double.Parse(Console.ReadLine());
            var sum = one * two;
            Console.WriteLine($"{sum:F2}");
        }
    }
}
