/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixaeletronico;

/**
 *
 * @author berna
 */
public class Operacoes{
    private String id;
    private Usuario[] usuarios;

    public Operacoes(String id, Usuario[] usuarios) {
        this.id = id;
        this.usuarios = usuarios;
    }
    
    public void saldo(){
        for (Usuario usuario : usuarios){
            break;
        }
        System.out.println("Você possui um saldo de ");
    }
    
    public void extrato(){
        
    }
    
    public void saque(){
    
    }

    public void deposito(){
        
    }
    
    public void pagamentos(){
        
    }
    
    public void transferencia(){
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
