using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p18_DifferentIntegerSizes
{
    class Program
    {
        static void Main(string[] args)
        {
            string number = Console.ReadLine();

            try
            {
                long checknum = long.Parse(number);
                Console.WriteLine(number + " can fit in:");
                if (checknum >= sbyte.MinValue && checknum <= sbyte.MaxValue)
                {
                    Console.WriteLine("* sbyte");
                }
                if (checknum >= byte.MinValue && checknum <= byte.MaxValue)
                {
                    Console.WriteLine("* byte");
                }
                if (checknum >= short.MinValue && checknum <= short.MaxValue)
                {
                    Console.WriteLine("* short");
                }
                if (checknum >= ushort.MinValue && checknum <= ushort.MaxValue)
                {
                    Console.WriteLine("* ushort");
                }
                if (checknum >= int.MinValue && checknum <= int.MaxValue)
                {
                    Console.WriteLine("* int");
                }
                if (checknum >= uint.MinValue && checknum <= uint.MaxValue)
                {
                    Console.WriteLine("* uint");
                }
                Console.WriteLine("* long");
            }
            catch (Exception)
            {
                Console.WriteLine(number + " can't fit in any type");
            }
        }
    }
}
