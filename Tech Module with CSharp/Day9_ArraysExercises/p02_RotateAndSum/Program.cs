using System;
using System.Linq;

namespace p02_RotateAndSum
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] inputDigits = Console.ReadLine().Split().Select(int.Parse).ToArray();
            int count = int.Parse(Console.ReadLine());
            int[] sumOfDigits = new int[inputDigits.Length];
            //int[] reversed = new int[inputDigits.Length];

            for (int i = 0; i < count; i++)
            {
                    int lastDigit = inputDigits[inputDigits.Length - 1];
                    for (int j = inputDigits.Length-1; j > 0; j--)
                    {
                        inputDigits[j] = inputDigits[j - 1];
                    }
                         inputDigits[0] = lastDigit;

                for (int j = 0; j < inputDigits.Length; j++)
                {
                    sumOfDigits[j] += inputDigits[j];
                }
            }
            Console.WriteLine(string.Join(" ", sumOfDigits));
        }
    }
}
