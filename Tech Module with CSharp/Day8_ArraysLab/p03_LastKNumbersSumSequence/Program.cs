using System;

namespace p03_LastKNumbersSumSequence
{
    class Program
    {
        static void Main(string[] args)
        {
            long n = long.Parse(Console.ReadLine());
            long k = long.Parse(Console.ReadLine());
            long[] array = new long[n];
            array[0] = 1;

            for (long i = 1; i < array.Length; i++)
            {
                long fuckyou = Math.Max(0, i - k);
                long fuckyourpussybichassnigga = n - 1;
                long sum = 0;
                for (long j = fuckyou; j <= fuckyourpussybichassnigga; j++)
                { 
                    sum += array[j];
                }
                array[i] = sum;
            }
            for (long prlongit = 0; prlongit < array.Length; prlongit++)
            {
                Console.WriteLine($"{array[prlongit]} ");
            }
            Console.WriteLine();
        }
    }
}
