/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;

/**
 *
 * @author BernardoOliveiraBenc
 */
public abstract class Veiculo {
    
    public String marca;
    public String modelo;
    public int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract void exibirInfo();
    
}
