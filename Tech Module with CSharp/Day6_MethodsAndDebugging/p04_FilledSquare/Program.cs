using System;
namespace p04_FilledSquare
{
	class MainClass
	{
		public static void Main(string[] args)
		{
            int n = int.Parse(Console.ReadLine());
			PrintTopNBottom(n);
			PrintMid(n);
			PrintTopNBottom(n);


		}
		static void PrintTopNBottom(int n)
		{
			Console.WriteLine(new string('-', 2 * n));
		}
		static void PrintMid(int n)
		{
			Console.Write("-");
			for (int i = 1; i < n - 1; i++)
			{
				if (i > 1)
					Console.Write("-");
				for (int j = 1; j < n; j++)
				{
					Console.Write("\\/");
				}
				Console.WriteLine("-");
			}
		}
	}
}
