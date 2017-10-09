using System;

namespace p08_CenterPoint
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			//why you do this to us dammit
			double x1 = double.Parse(Console.ReadLine());
			double y1 = double.Parse(Console.ReadLine());
			double x2 = double.Parse(Console.ReadLine());
			double y2 = double.Parse(Console.ReadLine());
			string closestTo0 = ClosestTo0(x1, y1, x2, y2);
			Console.WriteLine(closestTo0);
		}
		static string ClosestTo0(double x1, double y1, double x2, double y2)
		{
			double firstCord = 0;
			for (double i = Math.Abs(x1); i >= 0; i--)
			{
				firstCord++;
			}
			for (double i = Math.Abs(y1); i >= 0; i--)
			{
				firstCord++;
			}
			double secondCord = 0;
			for (double i = Math.Abs(x2); i >= 0; i--)
			{
				secondCord++;
			}
			for (double i = Math.Abs(y2); i >= 0; i--)
			{
				secondCord++;
			}
			string returnString = "";
			if (firstCord < secondCord)
				return returnString = "(" + x1 + ", " + y1 + ")";
			else if (secondCord < firstCord)
				return returnString = "(" + x2 + ", " + y2 + ")";
			else return returnString = "(" + x1 + ", " + y1 + ")";
		}
	}
}
