using System;

namespace p07_MathPower
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());
            double squared = MathPower(number, power);
            Console.WriteLine(squared);
        }
        static double MathPower(double number, int power)
        {
            double squared = 1d;
            for (int i = 0; i < power; i++)
            {
                squared *= number;
            }
            return squared;
        }
    }
}
