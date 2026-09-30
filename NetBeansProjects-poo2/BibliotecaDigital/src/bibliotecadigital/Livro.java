/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecadigital;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Livro {
    
    public int id;
    public String titulo;
    public String autor;
    public CategoriaLivro categoria;
    public String dataLancamento;
    
    public Livro(int id, String titulo, String autor, CategoriaLivro categoria, String data){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.dataLancamento = data;
    }
    
}
