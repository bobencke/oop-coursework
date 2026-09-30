/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Programador extends Funcionario{
    
    public String principalLinguagem;
    
    public Programador(String nome, String cargo, double salarioBase, String linguagem){
        super(nome, cargo, salarioBase);
        this.principalLinguagem = linguagem;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase;
    }
    
    @Override
    public String toString(){
        return "\nFuncionário: " + this.nome +
                ", Cargo: " + this.cargo +
                ", Salário: " + this.calcularSalario() +
                ", Principal linguagem: " + this.principalLinguagem;
    }
    
}
