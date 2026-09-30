using System;

class Aluno
{

    public string nome;
    public double nota1, nota2;

    public double Media()
    {

        return (nota1 + nota2) / 2;

    }

    public string Situacao(double media)
    {

        return media >= 7 ? "aprovado" : "reprovado";

    }

    public void Mensagem()
    {

        double media = Media();
        string situacao = Situacao(media);

        Console.WriteLine($"A média que o aluno {nome} obteu foi {media}. Ele está {situacao}!");

    }

}