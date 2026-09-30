/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo4;

/**
 *
 * @author berna
 */
public class ContaBanco {
    
// Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

// Métodos personalizados
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50.0f);
        }else if (t == "CP"){
            this.setSaldo(150.0f);
        }
        System.out.println("\nConta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Conta fechada!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        
        if (this.getStatus()){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Conta fechada!");
        }
    }
    
// Métodos especiais
    public ContaBanco(){
        this.saldo = 0.0f;
        this.status = false;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    

}
