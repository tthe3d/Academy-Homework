using System;

namespace p02_SignOfIntegerNumber
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            CheckSign();
        }
        static void CheckSign()
        {
			string input = Console.ReadLine();
			double num = double.Parse(input);
			Console.Write($"The number {input} is ");
			if (num > 0)
				Console.WriteLine("positive.");
			else if (num == 0)
				Console.WriteLine("zero.");
			else Console.WriteLine("negative.");
        }
    }
}
