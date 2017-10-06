using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Schema;

namespace p08_EmployeeData
{
    class Program
    {
        static void Main(string[] args)
        {
            string firstName = Console.ReadLine();
            string lastName = Console.ReadLine();
            int age = int.Parse(Console.ReadLine());
            char gender = Char.Parse(Console.ReadLine());
            long personalID = long.Parse(Console.ReadLine());
            int employeeID = int.Parse(Console.ReadLine());


            Console.WriteLine($"First name: {firstName}\r\nLast name: {lastName}\r\nAge: {age}\r\n" +
                              $"Gender: {gender}\r\nPersonal ID: {personalID}\r\nUnique Employee number: {employeeID}\r\n");

        }
    }
}
