using System;

class Program{

    public static void Main(){

        PessoaFisica pf = new PessoaFisica();
        pf.TaxaEmprestimo(1000);

        PessoaJuridica pj = new PessoaJuridica();
        pj.TaxaEmprestimo(1000);

    }

}