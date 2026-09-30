/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeprova2;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Empresa implements ICMS{
    private String cnpj;
    private String nome;
    private String endereco;
    private float totalVendas;
    private float totalImpostos;
    
    public void efetuarVenda(int qtde, float valorUnitario){
        double precoFinal = valorUnitario * qtde;
        
        totalVendas += precoFinal;
        
        if(this instanceof IPI)
            totalImpostos += ((IPI)this).calcularIPI(precoFinal);
        
        totalImpostos += calcularICMS(precoFinal);
        
    }
    
        @Override
    public float calcularICMS(float base) {
        return base * PERCENTUAL_ICMS / 100;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getTotalImpostos() {
        return totalImpostos;
    }

    public void setTotalImpostos(float totalImpostos) {
        this.totalImpostos = totalImpostos;
    }
     
}
