using System;

namespace p04_Elevator
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            int person = int.Parse(Console.ReadLine());
            int capacity = int.Parse(Console.ReadLine());
            int count = 0;
            int remainder = 0;
            for (int i = person; i >= capacity; i-=capacity)
            {
                count++;
            }
            remainder = person % capacity;
            if (remainder == 0)
            Console.WriteLine(count);
            else Console.WriteLine(count+1);
        }
    }
}
