using System;

namespace p08_LongerLine
{
	class MainClass
	{
		public static void Main(string[] args)
		{
			//first line
			double x1 = double.Parse(Console.ReadLine());
			double y1 = double.Parse(Console.ReadLine());
			double x2 = double.Parse(Console.ReadLine());
			double y2 = double.Parse(Console.ReadLine());
			//second line
			double x3 = double.Parse(Console.ReadLine());
			double y3 = double.Parse(Console.ReadLine());
			double x4 = double.Parse(Console.ReadLine());
			double y4 = double.Parse(Console.ReadLine());
			string closestTo0 = LongerCordLine(x1, y1, x2, y2, x3, y3, x4, y4);
			Console.WriteLine(closestTo0);
		}
		static string LongerCordLine(double x1, double y1, double x2,
								 double y2, double x3, double y3, double x4, double y4)
		{
			double x1Cord = FindCord(x1);
			double y1Cord = FindCord(y1);
			double xy1 = x1Cord + y1Cord;

			double x2Cord = FindCord(x2);
			double y2Cord = FindCord(y2);
			double xy2 = x2Cord + y2Cord;

			double firstCord = x1Cord + x2Cord + y1Cord + y2Cord;

			double x3Cord = FindCord(x3);
			double y3Cord = FindCord(y3);
			double xy3 = x3Cord + y3Cord;

			double x4Cord = FindCord(x4);
			double y4Cord = FindCord(y4);
			double xy4 = x4Cord + y4Cord;

			double secondCord = x3Cord + x4Cord + y3Cord + y4Cord;

			string returnString = "";


			if (firstCord > secondCord)
				if (xy2 < xy1)
					return returnString = "(" + x2 + ", " + y2 + ")" + "(" + x1 + ", " + y1 + ")";
				else return returnString = "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")";
			else if (secondCord > firstCord)
				if (xy4 < xy3)
					return returnString = "(" + x4 + ", " + y4 + ")" + "(" + x3 + ", " + y3 + ")";
				else return returnString = "(" + x3 + ", " + y3 + ")" + "(" + x4 + ", " + y4 + ")";
			else if (xy2 < xy1)
				return returnString = "(" + x2 + ", " + y2 + ")" + "(" + x1 + ", " + y1 + ")";
			else return returnString = "(" + x1 + ", " + y1 + ")" + "(" + x2 + ", " + y2 + ")";
		}
		static double FindCord(double x)
		{
			double cord = 0;
			for (double k = Math.Abs(x); k > 0; k--)
			{
				cord++;
			}
			return cord;
		}
	}
}