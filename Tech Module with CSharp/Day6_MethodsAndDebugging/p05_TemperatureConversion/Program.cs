using System;

namespace p05_TemperatureConversion
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            double fahrenheit = double.Parse(Console.ReadLine());
            var celcius = FahrenheitToCelcius(fahrenheit);
            Console.WriteLine($"{celcius:F2}");
        }
        static double FahrenheitToCelcius(double fahrenheit)
        {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
}
