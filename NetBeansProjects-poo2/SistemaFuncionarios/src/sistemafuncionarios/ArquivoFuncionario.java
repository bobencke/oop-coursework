/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class ArquivoFuncionario {
    
    public static List<Funcionario> lerArquivo(String caminhoArquivo){
        
        List<Funcionario> funcionarios = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            
            String linha;
            
            while((linha = br.readLine()) != null){
                
                String[] dados = linha.split(";");
                
                String tipo = dados[0];
                String nome = dados[1];
                double salarioBase = Double.parseDouble(dados[2]);
                
                switch (tipo.toUpperCase()) {
                  
                case "GERENTE":
                    
                    double bonus = Double.parseDouble(dados[3]);
                    funcionarios.add(new Gerente(nome, "Gerente", salarioBase, bonus));
                    break;
                        
                case "PROGRAMADOR":
                    
                    String linguagem = dados[3];
                    funcionarios.add(new Programador(nome, "Programador", salarioBase, linguagem));
                    break;
                        
                }
                
            }

        }
        catch(Exception e){
            System.out.println("Não foi possível ler o arquivo.");
        }
        
        return funcionarios;
        
    }
    
}
