using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p07_MostFrequentNumber
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] originalNumbers = Console.ReadLine()
                .Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries)
                .Select(int.Parse)
                .ToArray();
            int[] addedNumbets = new int[1000000];

            for (int i = 0; i < addedNumbets.Length; i++)
            {
                for (int j = 0; j < originalNumbers.Length; j++)
                {
                    if (i == originalNumbers[j])
                    {
                        addedNumbets[i]++;
                    }
                }
            }
            for (int i = 0; i < originalNumbers.Length; i++)
            {
                if (addedNumbets[originalNumbers[i]] == addedNumbets.Max())
                {
                    Console.WriteLine(originalNumbers[i]);
                    return;
                }
            }
        }
    }
}
