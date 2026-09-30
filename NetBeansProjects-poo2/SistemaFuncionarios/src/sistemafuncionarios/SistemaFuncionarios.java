/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafuncionarios;

import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class SistemaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String caminhoArquivo = "funcionarios.txt";
        
        List<Funcionario> funcionarios = ArquivoFuncionario.lerArquivo(caminhoArquivo);
        
        System.out.println("Sistema de Gerenciamento de Funcionários:");
        
        for(Funcionario f : funcionarios){
            System.out.println(f.toString());
        }
        
    }
    
}
