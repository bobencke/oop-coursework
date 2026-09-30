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
public class Carro extends Veiculo{
    
    public int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas){
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }
    
    public void exibirInfo(){
        
        System.out.println("\nTipo: Carro" +
                ", Modelo: " + this.modelo +
                ", Marca: " + this.marca +
                ", Ano: " + this.ano +
                ", Nº de Portas: " + this.numPortas);
        
    }
    
}
