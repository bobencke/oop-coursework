/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixaeletronico;

/**
 *
 * @author berna
 */
public class Usuario {
    private String id;
    private String senha;
    private float saldo;
    
    public Usuario(String id, String senha, float saldo) {
        this.id = id;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public void reconhecimentoID(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
