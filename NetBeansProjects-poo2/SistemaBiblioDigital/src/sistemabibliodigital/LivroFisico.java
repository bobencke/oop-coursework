/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliodigital;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class LivroFisico extends Livro {
    
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println( "\nTítulo: " + this.titulo +
                ", Autor: " + this.autor +
                ", Ano de Publicação: " + this.anoPublicacao +
                ", Tipo : Livro Digital" +
                ", Número de páginas: " + this.numeroPaginas +
                "\n");
    }
    
}
