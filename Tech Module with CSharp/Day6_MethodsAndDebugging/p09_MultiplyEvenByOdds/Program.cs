using System;
using System.Linq;

namespace p09_MultiplyEvenByOdds
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int numberInput = int.Parse(Console.ReadLine());
            int even = GetEven(numberInput);
            int odd = GetOdd(numberInput);
            int result = even * odd;
            Console.WriteLine(result);

        }
        static int GetEven(int input)
        {
            string stringNumber = "";
            while (Math.Abs(input) > 0)
            {
                if ((Math.Abs(input) % 10) % 2 == 0)
                {
                    int newinput = Math.Abs(input) % 10;
                    if (stringNumber == "")
                        stringNumber += newinput;
                    else stringNumber += " " + newinput;
                    input /= 10;
                }
                else input /= 10;
            }
            if (stringNumber.Length > 0)
            {
                int[] numbers = stringNumber.Split(' ').Select(int.Parse).ToArray();
                return numbers.Sum();
            }
            else return 0;
        }
        static int GetOdd(int input)
        {
            string stringNumber = "";
            while (Math.Abs(input) > 0)
            {
                if ((Math.Abs(input) % 10) % 2 == 1)
                {
                    int newinput = Math.Abs(input) % 10;
                    if (stringNumber == "")
                        stringNumber += newinput;
                    else stringNumber += " " + newinput;
                    input /= 10;
                }
                else input /= 10;
            }
            if (stringNumber.Length > 0)
            {
                int[] numbers = stringNumber.Split(' ').Select(int.Parse).ToArray();
                return numbers.Sum();
            }
            else return 0;
        }
    }
}
