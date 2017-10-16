using System;
using System.Linq;

class p01_LargestCommonEnd
{
    static void Main(string[] args)
    {
        string[] firstString = Console.ReadLine().Split(' ').ToArray();
        string[] secondString = Console.ReadLine().Split(' ').ToArray();
        int fromTheLeft = 0;
        int fromTheRight = 0;
        int count = 0;

        //shorter array
        int shorterLength = 0;
        if (firstString.Length <= secondString.Length)
        {
            shorterLength = firstString.Length;
        }
        else
        {
            shorterLength = secondString.Length;
        }


        for (int i = 0; i < shorterLength; i++)
        {
            if (firstString[i] == secondString[i])
            {
                count++;
                if (count > fromTheLeft)
                    fromTheLeft = count;

            }
            else if (firstString[i] != secondString[i])
                count = 0;
        }

        count = 0;

        for (int i = 0; i < shorterLength; i++)
        {
            if (firstString[firstString.Length-1-i] == secondString[secondString.Length - 1 - i])
            {
                count++;
                if (count > fromTheRight)
                    fromTheRight = count;

            }
            else if (firstString[i] != secondString[i])
                count = 0;
        }
        if (fromTheRight>=fromTheLeft)
        {
            Console.WriteLine(fromTheRight);
        }else Console.WriteLine(fromTheLeft);

    }
}