/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo8;

/**
 *
 * @author berna
 */
public class POO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1112);
       b1.setNome("Manuela");
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
    }
    
}
