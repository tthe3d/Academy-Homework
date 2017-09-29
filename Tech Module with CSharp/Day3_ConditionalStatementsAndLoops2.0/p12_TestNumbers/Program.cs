using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p12_TestNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int max = int.Parse(Console.ReadLine());
            int sum = 0;
            int combinations = 0;
            bool stopped = false;

            for (int i = a; i > 0; i--)
            {
                for (int j = 1; j <= b; j++)
                {
                    sum = sum + 3 * (i * j);
                    combinations++;
                    if (sum >= max)
                    {
                        stopped = true;
                        break;
                    }
                }
                if (sum >= max)
                    break;
            }
            if (stopped == true)
                Console.WriteLine($"{combinations} combinations\r\nSum: {sum} >= {max}");
            else Console.WriteLine($"{combinations} combinations\r\nSum: {sum}");
        }
    }
}
