/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author BernardoOliveiraBenc
 */
public abstract class Funcionario {
    
    public String nome;
    public String cargo;
    public double salarioBase;
    
    public Funcionario(String nome, String cargo, double salarioBase){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
    
}
