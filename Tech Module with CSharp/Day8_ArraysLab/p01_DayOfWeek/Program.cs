using System;

namespace p01_DayOfWeek
{
    class Program
    {
        static void Main(string[] args)
        {
            int whichDay = int.Parse(Console.ReadLine());
            string[] days = 
            {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
            };
            try
            {
                Console.WriteLine(days[whichDay - 1]);
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid Day!");
            }
        }
    }
}
