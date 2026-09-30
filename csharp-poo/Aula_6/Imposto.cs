using System;

class Imposto
{

    public virtual void ValeAlimentacao(double salario)
    {

        Console.WriteLine($"Deconto padrão do vale alimentação: R$ {salario * 0.1}");

    }

    public virtual void ValeTransporte(double salario)
    {

        Console.WriteLine($"Desconto padrão do vale trannporte: R$ {salario * 0.06}");
     
    }

}