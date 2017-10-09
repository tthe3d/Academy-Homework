using System;

namespace p04_ReverseInteger
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            string input = Console.ReadLine();
            Console.WriteLine(ReverseIt(input));
        }
        static string ReverseIt(string a)
        {
            string reversedString = "";
            string operationalA = a;
            for (int i = 0; i < a.Length; i++)
            {
                reversedString += operationalA.Substring(operationalA.Length - 1);

				operationalA = operationalA.Remove(operationalA.Length - 1);
            }
            return reversedString;
        }
    }
}
