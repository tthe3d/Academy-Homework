using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p07_CakeIngredients
{
    class Program
    {
        static void Main(string[] args)
        {
            string ingredient = "";
            int ingredients = 0;
            while (ingredient != "Bake!")
            {
                ingredient = Console.ReadLine();
                if (ingredient == "Bake!")
                    break;
                Console.WriteLine($"Adding ingredient {ingredient}.");
                ingredients++;
            }
            Console.WriteLine($"Preparing cake with {ingredients} ingredients.");
        }
    }
}
