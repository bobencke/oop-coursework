/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemabibliodigital;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class SistemaBiblioDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String caminhoArquivo = "livros.txt";
        List<Livro> livros = LeitorBiblioteca.carregarLivros(caminhoArquivo);

        System.out.println("=== Sistema de Catálogo de Livros ===");
        System.out.println("Total de livros carregados: " + livros.size());

        while (true) {
            
            System.out.println("O que deseja realizar?\n");
            System.out.println("1 - Buscar por título");
            System.out.println("2 - Buscar por autor");
            System.out.println("3 - Sair\n");
            
            System.out.print("Resposta: ");
            Scanner sc1 = new Scanner(System.in);
            int escolha = sc1.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String tituloBusca = sc1.nextLine();
                    Livro.buscarPorTitulo(livros, tituloBusca);
                    break;
                case 2:
                    System.out.print("Digite o nome do autor: ");
                    String autorBusca = sc1.nextLine();
                    Livro.buscarPorAutor(livros, autorBusca);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
    }
    
}
