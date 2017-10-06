using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p12_RectangleProperties
{
    class Program
    {
        static void Main(string[] args)
        {
            double rectangleWidth = double.Parse(Console.ReadLine());
            double rectangleHeight = double.Parse(Console.ReadLine());
            double perimeter = (rectangleWidth * 2) + (rectangleHeight * 2);
            double area = rectangleWidth * rectangleHeight;
            double diagonal = (rectangleHeight * rectangleHeight) + (rectangleWidth * rectangleWidth);

            Console.WriteLine($"{perimeter}\r\n{area}\r\n{Math.Sqrt(diagonal)}");
        }
    }
}
