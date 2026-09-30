/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaveiculos;
import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class SistemaVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String caminhoArquivo = "veiculos.txt";
        
        List<Veiculo> veiculos = LeitorArquivo.lerArquivo(caminhoArquivo);
        
        System.out.println("Sistema de Gerenciamento de Veículos: ");
        
        for(Veiculo v : veiculos){
            v.exibirInfo();
        }
        
    }
    
}
