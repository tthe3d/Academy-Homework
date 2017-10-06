using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p04_HexConver
{
    class Program
    {
        static void Main(string[] args)
        {

            string hexToConvert = Console.ReadLine();
            Console.WriteLine(Convert.ToInt32(hexToConvert, 16));

        }
    }
}
