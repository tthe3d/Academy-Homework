using System;

namespace p11_GeometryCalculator
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            string figure = Console.ReadLine();
            double result = GetArea(figure);
            Console.Write($"{result:F2}");


        }
        static double GetArea(string figure)
        {
            switch (figure.ToLower())
            {
                case "triangle":
                    double side = double.Parse(Console.ReadLine());
                    double height = double.Parse(Console.ReadLine());
                    return (side * height) / 2;
                case "square":
                    side = double.Parse(Console.ReadLine());
                    return side * side;
                case "rectangle":
					side = double.Parse(Console.ReadLine());
					double otherside = double.Parse(Console.ReadLine());
                    return (side * otherside);
                case "circle":
                    double radius = double.Parse(Console.ReadLine());
                    return radius * radius * Math.PI;
                default:
                    Console.WriteLine($"Wrong Input!");
                    Console.Write("Error: ");
                    return 69;

            }
        }
    }
}
