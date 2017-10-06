using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace p05_BooleanConvert
{
    class Program
    {
        static void Main(string[] args)
        {

            string boolToConvert = Console.ReadLine();
            if (Convert.ToBoolean(boolToConvert) == true)
            {
                Console.WriteLine("Yes");
            }else Console.WriteLine("No");
        }
    }
}
