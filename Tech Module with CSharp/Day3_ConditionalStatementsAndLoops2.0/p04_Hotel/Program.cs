using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p04_Hotel
{
    class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine().ToLower();
            int count = int.Parse(Console.ReadLine());
            double studio = 0;
            double dable = 0;
            double suite = 0;
            bool open = false;
            switch (month)
            {
                case ("may"):
                case ("october"):
                    studio = 50;
                    if (count > 7)
                    {
                        studio *= 0.95;
                    }
                    dable = 65;
                    suite = 75;
                    open = true;
                    break;
                case ("june"):
                case ("september"):
                    studio = 60;
                    dable = 72;
                    if (count > 14)
                    {
                        dable *= 0.90;
                    }
                    suite = 82;
                    open = true;
                    break;
                case ("july"):
                case ("august"):
                case ("december"):
                    studio = 68;
                    dable = 77;
                    suite = 89;
                    if (count > 14)
                    {
                        suite *= 0.85;

                    }
                    open = true;
                    break;
                default:
                    Console.WriteLine("Closed");
                    break;
            }
            if (month == "september" && count > 7 || month == "october" && count > 7)
            {
                studio = studio - (studio / count);
            }
            if (open == true)
                Console.WriteLine("Studio: {0:F2} lv.\r\nDouble: {1:F2} lv.\r\nSuite: {2:F2} lv.", studio * count, dable * count, suite * count);
        }
    }
}
