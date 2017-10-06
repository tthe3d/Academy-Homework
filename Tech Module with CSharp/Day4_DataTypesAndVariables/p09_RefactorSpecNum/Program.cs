using System;

namespace p09_RefactorSpecNum
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			int count = int.Parse(Console.ReadLine());
            int total = 0;
            int specialNumber = 0; 
            bool hitSpecialNumber = false;

			for (int i = 1; i <= count; i++)
           {
				specialNumber = i;


                               // loooooooooool, best loop so far
				while (i > 0)
                {
					total += i % 10;
					i = i / 10;
				}



				hitSpecialNumber = (total == 5) || (total == 7) || (total == 11);
				
                Console.WriteLine($"{specialNumber} -> {hitSpecialNumber}");

				total = 0;

				i = specialNumber;
			}

        }
    }
}
