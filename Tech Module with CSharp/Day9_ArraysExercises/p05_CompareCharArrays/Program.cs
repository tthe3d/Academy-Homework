using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p05_CompareCharArrays
{
    class Program
    {
        static void Main(string[] args)
        {
            char[] firstChar = Console.ReadLine().Split(' ').Select(char.Parse).ToArray();
            char[] secondChar = Console.ReadLine().Split(' ').Select(char.Parse).ToArray();

            if (firstChar.Length == secondChar.Length)
            {
                if (firstChar[0] > secondChar[0])
                {
                    Console.WriteLine(secondChar);
                    Console.WriteLine(firstChar);
                }
                else
                {
                    Console.WriteLine(firstChar);
                    Console.WriteLine(secondChar);
                }
            }
            else if (firstChar.Length > secondChar.Length)
            {
                Console.WriteLine(secondChar);
                Console.WriteLine(firstChar);
            }
            else
            {
                Console.WriteLine(firstChar);
                Console.WriteLine(secondChar);
            }
        }
    }
}
