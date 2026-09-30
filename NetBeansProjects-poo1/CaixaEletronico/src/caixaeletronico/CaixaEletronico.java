/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Digite o seu CPF: ");
        String cpf = scanner1.nextLine();
        
        scanner1.close();
        
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Digite a sua senha: ");
        String senha = scanner2.nextLine();
        
        scanner2.close();
        
        Usuario login = new Usuario(cpf, senha);
        
        System.out.println("");
        
    }
    
}
