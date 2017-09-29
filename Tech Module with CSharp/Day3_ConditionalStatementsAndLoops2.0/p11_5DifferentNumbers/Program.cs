using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p11_5DifferentNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            bool nein = true;
            int shaise = 0;
            for (int i = a; i <= b; i++)
            {
                for (int j = a; j <= b; j++)
                {
                    for (int k = a; k <= b; k++)
                    {
                        for (int h = a; h <= b; h++)
                        {
                            for (int m = a; m <= b; m++)
                            {
                                if (i < j && j < k && k < h && h < m)
                                {
                                    Console.WriteLine($"{i} {j} {k} {h} {m}");
                                    shaise += 1;
                                }
                                else nein = false;
                            }
                        }
                    }
                }
            }
            if (nein == false && shaise == 0)
                Console.WriteLine("No");
        }
    }
}
