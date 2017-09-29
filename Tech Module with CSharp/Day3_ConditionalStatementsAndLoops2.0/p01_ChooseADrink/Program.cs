using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p01_ChooseADrink
{
    class Program
    {
        static void Main(string[] args)
        {
            string profess = Console.ReadLine().ToLower();

            switch (profess)
            {
                case ("athlete"):
                    Console.WriteLine("Water");
                    break;
                case ("businessman"):
                case ("businesswoman"):
                    Console.WriteLine("Coffee");
                    break;
                case ("softuni student"):
                    Console.WriteLine("Beer");
                    break;
                default:
                    Console.WriteLine("Tea");
                    break;
            }
        }
    }
}
