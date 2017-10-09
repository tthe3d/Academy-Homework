using System;

namespace p01_HelloName
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine($"Hello, {GetName()}!");
        }
        static string GetName()
        {
            string nameInput = Console.ReadLine();
            return nameInput;
        }
    }
}
