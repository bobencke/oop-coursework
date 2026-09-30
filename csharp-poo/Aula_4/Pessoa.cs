using System;

class Pessoa
{

    public double peso;
    public double altura;

    public double Imc()
    {

        return peso / (altura * altura);

    }

    public string Classificacao(double imc)
    {

        if(imc < 18.5 ){
            return "abaixo do peso";
        }else if(imc < 25){
            return "peso normal";
        }else if(imc < 30){
            return "acima do peso";
        }else if(imc < 35){
            return "obesidade I";
        }else if(imc < 40){
            return "obesidade II";
        }else{
            return "obesidade III";
        }

    }

    public void Mensagem(){

        double imc = Imc();
        string classificacao = Classificacao(imc);

        Console.WriteLine($"Você pesa {peso} quilos e possui {altura} cm de altura.");
        Console.WriteLine($"Seu IMC é de {imc:f2}. A sua classificação é: {classificacao}");

    }

}