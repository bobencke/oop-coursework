/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo7;

/**
 *
 * @author berna
 */
public class POO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p3.receberAumento(550.20f);
        p4.statusTrabalho();
        p2.cancelarMatricula();
        
    }
    
}
