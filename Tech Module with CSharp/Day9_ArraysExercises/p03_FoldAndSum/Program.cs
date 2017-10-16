using System;
using System.Linq;
using System.Runtime.InteropServices;

namespace p03_FoldAndSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();

            int halfNumbers = numbers.Length / 2;
            int halfTheHalf = numbers.Length / 4;

            //var temportalArrayForCalculations = new int[halfTheHalf];
            var middleNumbers = new int[halfNumbers];
            var firstBatch = new int[halfTheHalf];
            var lastBatch = new int [halfTheHalf];

            // set middle numbers
            for (int i = halfTheHalf,k = 0; i < numbers.Length-halfTheHalf; i++,k++)
            {
                middleNumbers[k] = numbers[i];
            }



            //reverse arrays
            for (int i = 0; i < halfTheHalf; i++)
            {
                firstBatch[i] = numbers[i];
            }
            Array.Reverse(firstBatch);
            for (int i = numbers.Length-1,k = 0; i > numbers.Length-1-halfTheHalf; i--,k++)
            {
                lastBatch[k] = numbers[i];
            }


            for (int i = 0; i < halfTheHalf; i++)
            {
                middleNumbers[i] += firstBatch[i];
                middleNumbers[i + halfTheHalf] += lastBatch[i];
            }
            foreach (var VARIABLE in middleNumbers)
            {
                Console.Write(VARIABLE + " ");
            }
            Console.WriteLine();
        }
    }
}
