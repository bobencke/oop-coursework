using System;

class Program
{

    public static void Main()
    {

        Imposto estagiario = new Estagiario();
        estagiario.ValeAlimentacao(1000);
        estagiario.ValeTransporte(1000);
        Console.WriteLine("---------------");

        Imposto atendente = new Atendente();
        atendente.ValeAlimentacao(3000);
        atendente.ValeTransporte(3000);
        Console.WriteLine("---------------");

        Imposto gerente = new Gerente();
        gerente.ValeAlimentacao(5000);
        gerente.ValeTransporte(5000);
        Console.WriteLine("---------------");


    }

}