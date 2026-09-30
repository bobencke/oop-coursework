using System;

class Program{

    public static void Main(){

        Pessoa pessoa = new Pessoa();

        pessoa.apresentar();
        pessoa.apresentar("Bernardo");
        pessoa.apresentar("Bernardo", 22);

    }

}