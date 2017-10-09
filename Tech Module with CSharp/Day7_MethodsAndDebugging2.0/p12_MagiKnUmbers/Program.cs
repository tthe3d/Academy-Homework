using System;
using System.Linq.Expressions;

namespace p12_MagiKnUmbers
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            Console.WriteLine(GetMagiK(number));
        }
        static string GetMagiK(int number)
        {
            string magikNumbers = "";
            int start = 0;
            for (int i = 1; i <= number; i++)
            {
                if (getStatus(i) == true)
                {
                    if (SumOfDigits(i) == true)
                    {
                        if(IsItEvenMan(i) == true)
                        {
                            if (start == 0)
                            {
                                magikNumbers = i.ToString();
                                start = 1;
                            }
                            else magikNumbers += $"\r\n{i}";
                        }
                    }
                }
            }
            return magikNumbers;
        }
		public static bool getStatus(int i)
		{
            string myString = i.ToString();
			string first = myString.Substring(0, myString.Length / 2);
			char[] arr = myString.ToCharArray();
			Array.Reverse(arr);
			string temp = new string(arr);
			string second = temp.Substring(0, temp.Length / 2);
			return first.Equals(second);
		}
        static bool SumOfDigits(int i)
        {
			int sum = 0;
			while (i != 0)
			{
				sum += i % 10;
				i /= 10;
			}
            if (sum % 7 == 0)
                return true;
            else return false;
        }
        static bool IsItEvenMan (int i)
        {
            string isIt = i.ToString();
            foreach (char c in isIt)
            {
                if (c % 2 == 0)
                    return true;
            }
            return false;
        }
    }
}
