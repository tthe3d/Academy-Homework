using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p02_ChooseADrink2._0
{
    class Program
    {
        static void Main(string[] args)
        {
            string profess = Console.ReadLine();
            string operationProfess = profess.ToLower();
            int count = int.Parse(Console.ReadLine());
            double water = 0.70;
            double coffee = 1.00;
            double beer = 1.70;
            double tea = 1.20;
            switch (operationProfess)
            {
                case ("athlete"):
                    Console.WriteLine("The {0} has to pay {1:F2}.", profess, water * count);
                    break;
                case ("businessman"):
                case ("businesswoman"):
                    Console.WriteLine("The {0} has to pay {1:F2}.", profess, coffee * count);
                    break;
                case ("softuni student"):
                    Console.WriteLine("The {0} has to pay {1:F2}.", profess, beer * count);
                    break;
                default:
                    Console.WriteLine("The {0} has to pay {1:F2}.", profess, tea * count);
                    break;
            }
        }
    }
}
