using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p08_SumOfOddNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int num = int.Parse(Console.ReadLine());
            int sum = 0;
            for (int i = 1, odd = 1; i <= num; i++, odd += 2)
            {
                Console.WriteLine(odd);
                sum += odd;
            }
            Console.WriteLine("Sum: " + sum);
        }
    }
}
