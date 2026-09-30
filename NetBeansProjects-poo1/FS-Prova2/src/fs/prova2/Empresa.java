/*Gabarito da Prova 2 de Java eleborado na aula de Fábrica de Software
do dia 01/06/2023*/

package fs.prova2;

/**
 *
 * @author ivansuptitz
 */
public class Empresa implements ICMS {

    public Empresa(String cnpj, String nome, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    private String cnpj;
    private String nome;
    private String endereco;
    private double totalVendas;
    private double totalImpostos;
    
    public void efetuarVenda(int qtde, double valorUnitario){
        //(dado pela multiplicação do preço unitário pela quantidade
        double precoFinal = qtde * valorUnitario;
        
        //Este total deve ser acumulado no atributo totalVendas.
        totalVendas += precoFinal;
        
        if(this instanceof IPI)
            totalImpostos += ((IPI)this).calcularIPI(precoFinal);
        
        totalImpostos += calcularICMS(precoFinal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CNPJ: ").append(cnpj);
        sb.append(", Nome: ").append(nome);
        sb.append(", Endereço: ").append(endereco);
        sb.append(", Total de Vendas: R$")
                .append(String.format("%.2f", totalVendas));
        sb.append(", Total de Impostos: R$")
                .append(String.format("%.2f",totalImpostos));

        return sb.toString();
    }



    @Override
    public double calcularICMS(double base) {
        //o cálculo dos impostos se dá pela multiplicação da base passada por parâmetro
        //pela respectiva alíquota dividido por 100
        return base * PERCENTUAL_ICMS / 100;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }
}
