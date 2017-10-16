using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace p09_PairByDifference_
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine()
                .Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse).ToArray();
            byte memorysavin = byte.Parse(Console.ReadLine());
            byte count = 0;

            for (int i = 0; i < numbers.Length; i++)
            {
                for (int j = i+1; j < numbers.Length; j++)
                {
                    if (numbers[i] == numbers[j]-memorysavin || numbers[i] == numbers[j] + memorysavin)
                    {
                        count++;
                    }
                }
            }
            Console.WriteLine(count);
        }
    }
}
