/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryproject;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Book {
    
    private int id;
    private String title;
    private Category category;
    private Author author;
    private String releaseDate;

    public Book(int id, String title, Category category, Author author, String releaseDate) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return  "\n" + this.id + 
                " - Título: " + this.title + 
                ", Categoria: " + this.category +
                ", Autor: " + this.author.name +
                ", Data de Lançamento: " + this.releaseDate;
    }

    
    
}
