using System;

namespace p07_Greetings
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            String firstName = Console.ReadLine();
            String lastName = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            Console.WriteLine($"Hello, {firstName} {lastName}.You are {age} years old.");
        }
    }
}
