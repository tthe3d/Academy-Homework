using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p11_ConvertSpeedUnit
{
    class Program
    {
        static void Main(string[] args)
        {
            float meters = float.Parse(Console.ReadLine());
            float hours = float.Parse(Console.ReadLine());
            float minutes = float.Parse(Console.ReadLine());
            float seconds = float.Parse(Console.ReadLine());


            //Meters per Second
            float totalSeconds = hours * 3600 + minutes * 60 + seconds;
            float meterPerSecond = meters / totalSeconds;

            //Km per Hour
            float totalHours = hours + minutes / 60 + seconds / 3600;
            float kmPerHour = meters / 1000 / totalHours;

            //Miles per Hour
            float milesPerHour = meters / 1609 / totalHours;


            Console.WriteLine($"{meterPerSecond}\r\n{kmPerHour}\r\n{milesPerHour}");

        }
    }
}
