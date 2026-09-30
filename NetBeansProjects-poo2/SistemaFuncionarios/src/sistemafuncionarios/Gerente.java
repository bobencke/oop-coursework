/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Gerente extends Funcionario{
    
    public double bonus;
    
    public Gerente(String nome, String cargo, double salarioBase, double bonus){
        super(nome, cargo, salarioBase);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return "\nFuncionário: " + this.nome +
                ", Cargo: " + this.cargo +
                ", Salário: " + this.calcularSalario();
    }
    
    
    
}
