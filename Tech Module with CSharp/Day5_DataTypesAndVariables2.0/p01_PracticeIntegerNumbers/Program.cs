using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p01_PracticeIntegerNumbers
{
    class Program
    {
        static void Main(string[] args)
        {
            sbyte num1 = SByte.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            byte num2 = byte.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            short num3 = short.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            ushort num4 = ushort.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            uint num5 = uint.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            int num6 = int.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            long num7 = long.Parse(Console.ReadLine() ?? throw new InvalidOperationException());
            Console.Write($"{num1}\r\n{num2}\r\n{num3}\r\n{num4}\r\n{num5}\r\n{num6}\r\n{num7}\r\n");
        }
    }
}
