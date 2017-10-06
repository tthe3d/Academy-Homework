using System;

namespace p06_TriplesOfLetters
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int count = int.Parse(Console.ReadLine());

            for (char i = (char)97; i < (char)97+count; i++)
            {
                for (char j = (char)97; j < (char)97 + count; j++)
                {
                    for (char k = (char)97; k < (char)97 + count; k++)
                    {
                        Console.WriteLine($"{i}{j}{k}");
                    }
                }
            }
        }
    }
}
