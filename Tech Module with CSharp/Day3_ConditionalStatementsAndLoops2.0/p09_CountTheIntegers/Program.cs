using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p09_CountTheIntegers
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = 0;
            try
            {
                while (1 == 1)
                {
                    int num = int.Parse(Console.ReadLine());
                    count++;
                }
            }
            catch (Exception)
            {
                Console.WriteLine(count);
            }
        }
    }
}
