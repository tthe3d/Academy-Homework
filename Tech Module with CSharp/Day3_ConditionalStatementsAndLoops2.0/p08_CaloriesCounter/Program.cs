using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p08_CaloriesCounter
{
    class Program
    {
        static void Main(string[] args)
        {
            int ingredients = int.Parse(Console.ReadLine());
            int totalCal = 0;
            for (int i = 0; i < ingredients; i++)
            {
                string ingredient = Console.ReadLine().ToLower();
                switch (ingredient)
                {
                    case "cheese":
                        totalCal += 500;
                        break;
                    case "tomato sauce":
                        totalCal += 150;
                        break;
                    case "salami":
                        totalCal += 600;
                        break;
                    case "pepper":
                        totalCal += 50;
                        break;
                }
            }
            Console.WriteLine("Total calories: {0}", totalCal);
        }
    }
}
