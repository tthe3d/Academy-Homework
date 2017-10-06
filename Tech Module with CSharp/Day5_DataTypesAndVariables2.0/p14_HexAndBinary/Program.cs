using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization.Formatters.Binary;
using System.Text;
using System.Threading.Tasks;

namespace p14_HexAndBinary
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            string hex = Convert.ToString(number, 16).ToUpper();
            string binary = Convert.ToString(number, 2).ToUpper();
            Console.Write($"{hex}\r\n{binary}\r\n");

        }
    }
}
