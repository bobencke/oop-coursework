/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprova1;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;        

    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuVideo(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
