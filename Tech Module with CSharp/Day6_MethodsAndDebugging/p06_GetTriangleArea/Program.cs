using System;

namespace p06_GetTriangleArea
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            double width = double.Parse(Console.ReadLine());
            double height = double.Parse(Console.ReadLine());
            double area = TriArea(width,height);
            Console.WriteLine(area);
        }
		static double TriArea(double width, double height)
        {
            return width * height / 2;
        }
    }
}
