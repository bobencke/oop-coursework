using System;

class Program{

    public static void Main(string[] args){

        Pessoa person = new Pessoa();

        person.Name = "Bernardo";

        Console.WriteLine($"Olá {person.Name}");

    }

}