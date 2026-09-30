/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @author berna
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.maisVolume();
        c1.ligarMudo();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();
    }
    
}
