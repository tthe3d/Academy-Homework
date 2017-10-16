using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p02_ReverseArrayOfIntegers
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());
            int[] numbers = new int[count];


            for (int i = count-1; i >= 0; i--)
            {
                numbers[i] = int.Parse(Console.ReadLine());
            }
            for (int i = 0; i < count; i++)
            {
                if (count == 1) Console.Write($"{numbers[i]}\r\n");
                else if (i == 0)
                    Console.Write($"{numbers[i]}");
                else if (i < count-1) Console.Write($" {numbers[i]}");
                else if (count == 1) Console.Write($"{numbers[i]}\r\n");
                else Console.Write($" {numbers[i]}\r\n");
            }
        }
    }
}
