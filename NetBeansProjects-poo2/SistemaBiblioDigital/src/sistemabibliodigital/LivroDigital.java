/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabibliodigital;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class LivroDigital extends Livro {
    
    private double tamanhoArquivoMB;

    public LivroDigital(String titulo, String autor, int anoPublicacao, double tamanhoArquivoMB) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println( "\nTítulo: " + this.titulo +
                ", Autor: " + this.autor +
                ", Ano de Publicação: " + this.anoPublicacao +
                ", Tipo : Livro Digital" +
                ", Tamanho do Arquivo em MB: " + this.tamanhoArquivoMB +
                "\n");
    }
    
}
