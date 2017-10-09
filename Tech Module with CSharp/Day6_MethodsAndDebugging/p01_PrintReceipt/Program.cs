using System;

namespace p01_PrintReceipt
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			PrintHeader();
			PrintBody();
			PrintFoot();
		}

		static void PrintHeader()
		{
			Console.WriteLine("CASH RECEIPT\r\n------------------------------");
		}
		static void PrintBody()
		{
			Console.WriteLine("Charged to____________________\r\nReceived by___________________");
		}
		static void PrintFoot()
		{
			Console.WriteLine("------------------------------\r\n© SoftUni");
        }
    }
}
