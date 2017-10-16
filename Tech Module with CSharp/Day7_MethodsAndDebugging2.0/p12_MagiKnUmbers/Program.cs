using System;
using System.Linq;
using System.Linq.Expressions;
using System.Numerics;

namespace p12_MagiKnUmbers
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            ushort number = ushort.Parse(Console.ReadLine());
            Console.WriteLine(GetMagiK(number));
        }
        static string GetMagiK(BigInteger number)
        {
            string magikNumbers = "";
            byte start = 0;
            for (BigInteger i = 1; i <= number; i++)
            {
                if (GetStatus(i) == true)
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
		public static bool GetStatus(BigInteger i)
		{
            string iString = i.ToString();
		    string first = iString.Substring(0, iString.Length / 2);
		    char[] arr = iString.ToCharArray();
		    Array.Reverse(arr);
		    string temp = new string(arr);
		    string second = temp.Substring(0, temp.Length / 2);
		    return first.Equals(second);

        }
        static bool SumOfDigits(BigInteger i)
        {
			BigInteger sum = 0;
			while (i != 0)
			{
				sum += i % 10;
				i /= 10;
			}
            if (sum % 7 == 0)
                return true;
            else return false;
        }
        static bool IsItEvenMan (BigInteger i)
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
