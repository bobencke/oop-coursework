/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo5;

/**
 *
 * @author berna
 */
public class ControleRemoto implements Controlador{

// Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
// Métodos especiais
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
// Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------MENU-------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.print("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
