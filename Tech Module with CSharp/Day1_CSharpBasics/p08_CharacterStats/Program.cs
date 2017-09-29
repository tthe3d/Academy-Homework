using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p08_CharacterStats
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = Console.ReadLine();
            int health = int.Parse(Console.ReadLine());
            int maxhp = int.Parse(Console.ReadLine());
            int energy = int.Parse(Console.ReadLine());
            int maxene = int.Parse(Console.ReadLine());
            int fullhp = maxhp - health;
            int fullene = maxene - energy;

            Console.WriteLine($"Name: {name}\r\nHealth: |{new string('|', health)}{new string('.', maxhp - health)}|\r\nEnergy: |{new string('|', energy)}{new string('.', maxene - energy)}|");
        }
    }
}
