using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p04_DebitCardNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            var one = int.Parse(Console.ReadLine());
            var two = int.Parse(Console.ReadLine());
            var three = int.Parse(Console.ReadLine());
            var four = int.Parse(Console.ReadLine());
            Console.WriteLine($"{one:D4} {two:D4} {three:D4} {four:D4}");
        }
    }
}
