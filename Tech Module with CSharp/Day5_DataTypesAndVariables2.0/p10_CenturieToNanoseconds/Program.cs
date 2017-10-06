using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p10_CenturieToNanoseconds
{
    class Program
    {
        static void Main(string[] args)
        {
            short cent = short.Parse(Console.ReadLine());

            int years = cent * 100;
            int days = (int) (years * 365.2422);
            uint hours = (uint) days * 24;
            uint minutes = hours * 60;
            decimal seconds = (decimal) minutes * 60;
            decimal miliseconds = seconds * 1000;
            decimal microseconds = miliseconds * 1000;
            decimal nanoseconds = microseconds * 1000;


            Console.WriteLine($"{cent} centuries = " +
                              $"{years} years = " +
                              $"{days} days = " +
                              $"{hours} hours = " +
                              $"{minutes} minutes = " +
                              $"{seconds} seconds = " +
                              $"{miliseconds} milliseconds = " +
                              $"{microseconds} microseconds = " +
                              $"{nanoseconds} nanoseconds");
        }
    }
}
