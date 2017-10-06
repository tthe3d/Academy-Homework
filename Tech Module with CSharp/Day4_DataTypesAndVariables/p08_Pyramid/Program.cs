using System;

namespace p08_Pyramid
{
	class MainClass
	{
		public static void Main(string[] args)
		{
            Console.Write("Length: ");
            double lenght = double.Parse(Console.ReadLine());
            Console.Write("Width: ");
            double width = double.Parse(Console.ReadLine());
            Console.Write("Height: ");
            double heigth = double.Parse(Console.ReadLine());
			double Volume = (lenght * width * heigth) / 3;
			Console.Write($"Pyramid Volume: {Volume:F2}");
		}
	}
}