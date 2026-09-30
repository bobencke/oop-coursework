/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliodigital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class LeitorBiblioteca {
    
    public static List<Livro> carregarLivros(String caminhoArquivo) {
        
        List<Livro> livros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            
            String linha;
            
            while ((linha = br.readLine()) != null) {
                
                String[] dados = linha.split(";");
                String tipo = dados[0];
                String titulo = dados[1];
                String autor = dados[2];
                int anoPublicacao = Integer.parseInt(dados[3]);

                switch (tipo.toUpperCase()) {
                  
                case "LIVROFISICO":
                    
                    int numeroPaginas = Integer.parseInt(dados[4]);
                    livros.add(new LivroFisico(titulo, autor, anoPublicacao, numeroPaginas));
                    break;
                        
                case "LIVRODIGITAL":
                    
                    double tamanhoArquivoMB = Double.parseDouble(dados[4]);
                    livros.add(new LivroDigital(titulo, autor, anoPublicacao, tamanhoArquivoMB));
                    break;
                        
                }
                
            }
        } catch (Exception e) {
            System.out.println("Não foi possível ler o arquivo.");
        }

        return livros;
    }
    
}
