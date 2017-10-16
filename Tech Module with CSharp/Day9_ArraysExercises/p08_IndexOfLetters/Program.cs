using System;
using System.Linq;

namespace p08_IndexOfLetters
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine().ToLower();
            char[] letters = new char[26];


            for (char i = (char) 97, o = (char)0; i <= 122; i++,o++)
            {
                letters[o] = i;
            }

            for (int o = 0; o <= input.Length-1; o++)
            {
                for (int j = 0; j < 26; j++)
                {
                    if (letters[j] == input[o])
                    {
                        Console.WriteLine($"{input[o]} -> {j}");
                    }
                }
            }

        }
    }
}
