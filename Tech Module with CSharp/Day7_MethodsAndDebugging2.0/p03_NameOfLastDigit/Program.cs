using System;

namespace p03_NameOfLastDigit
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            long getInput = long.Parse(Console.ReadLine());
            Console.WriteLine(GetName(GetLastDigit(getInput)));
        }
        static long GetLastDigit(long a)
        {
            if (Math.Abs(a) > 9)
                return Math.Abs(a) % 10;
            else return Math.Abs(a);
        }
        static string GetName(long a)
        {
            switch (a)
            {
                case 1:
                    return "one";
				case 2:
					return "two";
				case 3:
					return "three";
				case 4:
					return "four";
				case 5:
					return "five";
				case 6:
					return "six";
				case 7:
					return "seven";
				case 8:
					return "eight";
				case 9:
					return "nine";
                default:
                    return "zero";
            }
        }
    }
}
