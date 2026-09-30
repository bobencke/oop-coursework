using System;

abstract class Padrao
{

    // Obrigatório
    
    public abstract void TaxaEmprestimo(double valor);

    // Obrigatório

    public void calculoPoupanca(double valor, double taxa)
    {

        Console.WriteLine($"Ganhos obtidos pela poupança: R$ {valor * taxa}");

    }
}