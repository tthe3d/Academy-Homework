using System;

namespace p03_exactSum
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            decimal sum = 0;
            int count = int.Parse(Console.ReadLine());
            for (int i = 0; i < count; i++)
            {
                decimal what = decimal.Parse(Console.ReadLine());
                sum += what;
            }
            Console.WriteLine(sum);
        }
    }
}
