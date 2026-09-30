/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo4;

/**
 *
 * @author berna
 */
public class POO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(001);
        p1.setDono("Manuela");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(150);
        p1.fecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setDono("Nagini");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        p2.estadoAtual();
        
    }
    
}
