/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliodigital;

import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public abstract class Livro {
    
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public abstract void exibirDetalhes();

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public static void buscarPorTitulo(List<Livro> livros, String tituloBusca) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(tituloBusca.toLowerCase())) {
                livro.exibirDetalhes();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com o título: " + tituloBusca);
        }
    }

        public static void buscarPorAutor(List<Livro> livros, String autorBusca) {
            boolean encontrado = false;
            for (Livro livro : livros) {
                if (livro.getAutor().toLowerCase().contains(autorBusca.toLowerCase())) {
                    livro.exibirDetalhes();
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Nenhum livro encontrado do autor: " + autorBusca);
            }
        }
    
}
