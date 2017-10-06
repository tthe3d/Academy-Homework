using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p07_ExchangeVariableValues
{
    class Program
    {
        static void Main(string[] args)
        {
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int newnum1 = 0;
            int newnum2 = 0;
            Console.Write($"Before:\r\na = {num1}\r\nb = {num2}\r\n");
            newnum1 = num2;
            newnum2 = num1;
            Console.Write($"After:\r\na = {newnum1}\r\nb = {newnum2}\r\n");
        }
    }
}
