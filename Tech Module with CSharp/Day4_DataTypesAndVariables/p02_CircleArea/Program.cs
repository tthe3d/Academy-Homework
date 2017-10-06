using System;

namespace p02_CircleArea
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			double rad = double.Parse(Console.ReadLine());
			double area = (double)(rad*rad * Math.PI);
            Console.WriteLine($"{area:f12}");
        }
    }
}
