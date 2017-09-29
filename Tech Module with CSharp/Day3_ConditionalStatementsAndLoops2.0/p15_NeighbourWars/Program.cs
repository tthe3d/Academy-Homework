using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p15_NeighbourWars
{
    class Program
    {
        static void Main(string[] args)
        {
            int peshoDmg = int.Parse(Console.ReadLine());
            int goshoDmg = int.Parse(Console.ReadLine());
            int peshoHp = 100;
            int goshoHp = 100;

            //round
            int round = 1;
            string grammarString = "";


            bool fight = true;

            while (fight == true)
            {
                //round



                //1st hit
                goshoHp -= peshoDmg;
                if (goshoHp > 0)
                {
                    Console.WriteLine($"Pesho used Roundhouse kick and reduced Gosho to {goshoHp} health.");
                    if (round % 3 == 0)
                    {
                        peshoHp += 10;
                        goshoHp += 10;
                    }
                    round++;
                }
                else
                {
                    //grammar
                    if (round == 1)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else if (round == 2)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else if (round == 3)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else grammarString = round.ToString() + "th";

                    Console.WriteLine("Pesho won in {0} round.", grammarString);
                    fight = false;
                    return;
                }
                //2nd hit

                peshoHp -= goshoDmg;
                if (peshoHp > 0)
                {
                    Console.WriteLine($"Gosho used Thunderous fist and reduced Pesho to {peshoHp} health.");
                    if (round % 3 == 0)
                    {
                        peshoHp += 10;
                        goshoHp += 10;
                    }
                    round++;
                }
                else
                {
                    //grammar
                    if (round == 1)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else if (round == 2)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else if (round == 3)
                    {
                        grammarString = round.ToString() + "th";
                    }
                    else grammarString = round.ToString() + "th";


                    Console.WriteLine("Gosho won in {0} round.", grammarString);
                    fight = false;
                    return;
                }

            }
        }
    }
}
