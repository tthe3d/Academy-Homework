using System;

namespace p08_GreaterOfTwoValues
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            string typeInput = Console.ReadLine();
            if(typeInput == "int")
            {
                int a = int.Parse(Console.ReadLine());
                int b = int.Parse(Console.ReadLine());
                int whichIsBigger = GetMax(a, b);
                Console.WriteLine(whichIsBigger);
            }
            else if (typeInput == "char")
            {
				char a = char.Parse(Console.ReadLine());
				char b = char.Parse(Console.ReadLine());
				char whichIsBigger = GetMax(a, b);
				Console.WriteLine(whichIsBigger);
            }
            else 
            {
				string a = Console.ReadLine();
				string b = Console.ReadLine();
				string whichIsBigger = GetMax(a, b);
				Console.WriteLine(whichIsBigger);
            }
        }
        static int GetMax(int first, int second)
        {
            if (first > second)
                return first;
            else if (second > first)
                return second;
            else return first;
        }
        static char GetMax(char first, char second)
        {
			if (first > second)
				return first;
			else if (second > first)
				return second;
			else return first;
        }
        static string GetMax(string first, string second)
        {
			if (first.CompareTo(second) > 0)
				return first;
			else if (second.CompareTo(first) > 0)
				return second;
			else return first;
        }
    }
}
