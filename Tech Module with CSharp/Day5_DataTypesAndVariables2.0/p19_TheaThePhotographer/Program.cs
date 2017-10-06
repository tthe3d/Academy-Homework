using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p19_TheaThePhotographer
{
    class Program
    {
        static void Main(string[] args)
        {
            //input
            long totalPictures = long.Parse(Console.ReadLine());
            long secondsToFilter = long.Parse(Console.ReadLine());
            long percentOfGoodPictures = long.Parse(Console.ReadLine());
            long secondsToUpload = long.Parse(Console.ReadLine());

            //calculate total seconds
            long totalTimeInSeconds = secondsToFilter * totalPictures;
            long totalGoodPictures = (long)Math.Ceiling(totalPictures * percentOfGoodPictures / 100d);

            totalTimeInSeconds += (totalGoodPictures * secondsToUpload);


            TimeSpan the3dcalculator = TimeSpan.FromSeconds(totalTimeInSeconds);
            Console.WriteLine($"{the3dcalculator.Days}:{the3dcalculator.Hours:D2}:{the3dcalculator.Minutes:D2}:{the3dcalculator.Seconds:D2}");
        }
    }
}
