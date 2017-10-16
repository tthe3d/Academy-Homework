using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p10_EqualSums
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] input = Console.ReadLine()
                .Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse).ToArray();
            int temporalSum1 = 0;
            int temporalSum2 = 0;
            bool check = false;

            for (int i = 0; i < input.Length; i++)
            {
                temporalSum1 = 0;
                temporalSum2 = 0;
                for (int j = 0; j < i; j++)
                {

                    temporalSum1 += input[j];
                }
                for (int k = i + 1; k < input.Length; k++)
                {

                    temporalSum2 += input[k];
                }
                if (temporalSum1 == temporalSum2)
                {
                    Console.WriteLine(i);
                    check = true;
                    return;
                }
            }

            if (check == false && input.Length == 1)
            {
                Console.WriteLine(0);
            }
            else Console.WriteLine("no");
        }
    }
}
