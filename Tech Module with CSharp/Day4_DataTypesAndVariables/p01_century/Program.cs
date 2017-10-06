using System;

namespace p01_century
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int century = int.Parse(Console.ReadLine());
            int year = century * 100;
            int day = (int)(year * 365.2422);
            int hours = day * 24;
            int minutes = hours * 60;
            Console.WriteLine("{0} centuries = {1} years = {2} days = {3} hours = {4} minutes", century, year, day, hours, minutes);
        }
    }
}
