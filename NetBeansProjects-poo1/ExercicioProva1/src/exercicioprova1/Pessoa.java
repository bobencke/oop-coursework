/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprova1;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
            
    protected void ganharExp(){
        
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExeriencia() {
        return experiencia;
    }

    public void setExeriencia(float exeriencia) {
        this.experiencia = exeriencia;
    }

    
    
}
