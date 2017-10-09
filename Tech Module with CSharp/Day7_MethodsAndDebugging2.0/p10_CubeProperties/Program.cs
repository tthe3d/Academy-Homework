using System;

namespace p10_CubeProperties
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            string type = Console.ReadLine();
            double side = double.Parse(Console.ReadLine());
            double getResult = GetResult(side, type);
            Console.WriteLine($"{getResult:F2}");
        }
        static double GetResult(double x,string t)
        {
            switch (t.ToLower())
            {
                case "face":
                    return Math.Sqrt((x * x) * 2);
                case "space":
                    return Math.Sqrt((x * x) * 3);
                case "volume":
                    return x * x * x;
                case "area":
                    return 6 * (x * x);
                default:
                    Console.WriteLine("Wrong input.");
                    return 0;
            }
        }
    }
}
