using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p10_MultiplicationTable2._0
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            int from = int.Parse(Console.ReadLine());

            for (int i = from; i <= 10; i++)
            {
                int sum = num * i;
                Console.WriteLine($"{num} X {i} = {sum}");
            }
            if (from > 10)
            {
                int sum = num * from;
                Console.WriteLine($"{num} X {from} = {sum}");
            }
        }
    }
}
