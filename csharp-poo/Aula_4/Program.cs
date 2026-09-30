using System;

class Program{

    public static void Main()
    {

        Pessoa pessoa = new Pessoa();

        Console.Write("Peso: ");
        pessoa.peso = double.Parse(Console.ReadLine());

        Console.Write("Altura: ");
        pessoa.altura = double.Parse(Console.ReadLine());
        pessoa.Mensagem();

    }

}