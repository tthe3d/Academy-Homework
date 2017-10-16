using System;
using System.Linq;

namespace p06_MaxSequenceOfEqualElements
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = Console.ReadLine()
                .Split(new char[]{ ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse).ToArray();

            int countNow = 1;
            int maxCount = 0;
            int firstNum = 0;

            int start = 0;

            for (int i = 0; i < numbers.Length-1; i++)
            {
                if (numbers[i] == numbers[i + 1])
                {
                    countNow++;
                    if (countNow > maxCount)
                    {
                        maxCount = countNow;
                        start = i + 2;
                    }
                }
                else
                    countNow = 1;
            }
            // NO ZERO TEST FAIL I 
            if (maxCount == 0)
                firstNum++;
            for (int j = start-maxCount; j < start+firstNum; j++)
            {
                Console.Write(numbers[j] + " ");
            }
            Console.WriteLine();
        }
    }
}
