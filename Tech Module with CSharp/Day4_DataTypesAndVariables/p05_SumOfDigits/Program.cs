using System;

namespace p05_SumOfDigits
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            
            //works till 99 probably


            int number = int.Parse(Console.ReadLine());
            bool yesOrno = false;
            for (int i = 1; i <= number; i++)
            {
				int lastDigit = i % 10;
				int Digits = i / 10;
                if (lastDigit+Digits==5 || lastDigit+Digits==7 || lastDigit+Digits==11 || i == 5 || i == 7)
                {
                    yesOrno = true;
                }
                Console.WriteLine($"{i} -> {yesOrno}");
                yesOrno = false;
            }    
        }
    }
}
