using System;
using System.Collections.Generic;

namespace p07_PrimesInGivenRange
{
	class MainClass
	{
        public static void Main(string[] args)
        {
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            List<string> primesInRange = FindPrimesInRange(a, b);
            primesInRange.ForEach(Console.Write);
        }
        static List<string> FindPrimesInRange(int a, int b)

        {

            // checks if the number it's the first that's about to be added
            // to the list of dinosaurs

            int checkFirstAdd = 0;

            // list that's about to be returned 
            List<string> dinosaurs = new List<string>();

            // checks for prime numbers to be added to the list of dinosaurs
            if (a <= b)
            {
                for (int n = a; n <= b; n++)
                {
                    if (n == 0 || n == 1)
                    {
                        continue;
                    }


                    byte checkforprime = 0;
                    for (int i = 1; i <= Math.Sqrt(n); i++)
                    {
                        if (n % i == 0)
                        {
                            checkforprime++;
                        }
                    }
					if (checkforprime < 2)
					{
						if (checkFirstAdd == 0)
						{
							string firstAdd = n.ToString();
							dinosaurs.Add(firstAdd);
							checkFirstAdd = 1;
						}
						else
						{
							string firstAdd = n.ToString();
							dinosaurs.Add(", " + $"{firstAdd}");
						}
					}
                }
            }
            else dinosaurs.Add("(empty list)");
            return dinosaurs;
        }
    }
}