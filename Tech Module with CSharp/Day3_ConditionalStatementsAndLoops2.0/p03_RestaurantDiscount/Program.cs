using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p03_RestaurantDiscount
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());
            string package = Console.ReadLine().ToLower();
            string room = "";
            double price = 0;

            if (count > 0 && count <= 50)
            {
                room = "Small Hall";
                price = 2500;
                if (package == "normal")
                {
                    price = (price + 500) * 0.95;
                }
                else if (package == "gold")
                {
                    price = (price + 750) * 0.90;
                }
                else if (package == "platinum")
                {
                    price = (price + 1000) * 0.85;
                }
            }
            else if (count > 50 && count <= 100)
            {
                room = "Terrace";
                price = 5000;
                if (package == "normal")
                {
                    price = (price + 500) * 0.95;
                }
                else if (package == "gold")
                {
                    price = (price + 750) * 0.90;
                }
                else if (package == "platinum")
                {
                    price = (price + 1000) * 0.85;
                }
            }
            else if (count > 100 && count <= 120)
            {
                room = "Great Hall";
                price = 7500;
                if (package == "normal")
                {
                    price = (price + 500) * 0.95;
                }
                else if (package == "gold")
                {
                    price = (price + 750) * 0.90;
                }
                else if (package == "platinum")
                {
                    price = (price + 1000) * 0.85;
                }
            }

            if (count > 0 && count < 121)
            {
                Console.WriteLine("We can offer you the {0}\r\nThe price per person is {1:F2}$", room, price / count);
            }
            else Console.WriteLine("We do not have an appropriate hall.");


            //switch ()
            //{
            //    case ("athlete"):
            //        Console.WriteLine("The {0} has to pay {1:F2}.",profess, water*count);
            //        break;
            //    case ("businessman"):
            //    case ("businesswoman"):
            //        Console.WriteLine("The {0} has to pay {1:F2}.", profess, coffee * count);
            //        break;
            //    case ("softuni student"):
            //        Console.WriteLine("The {0} has to pay {1:F2}.", profess, beer * count);
            //        break;
            //    default:
            //        Console.WriteLine("The {0} has to pay {1:F2}.", profess, tea * count);
            //        break;
            //}
        }
    }
}
