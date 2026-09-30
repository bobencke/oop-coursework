/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Moto extends Veiculo {
    
    public int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    
    public void exibirInfo(){
        
        System.out.println("\nTipo: Moto" +
                ", Modelo: " + this.modelo +
                ", Marca: " + this.marca +
                ", Ano: " + this.ano +
                ", Cilindradas: " + this.cilindradas);
        
    }

    
}
