/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryproject;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Author {
    
    public String name;
    public int booksWritten;
    
    public Author(String name){
        this.name = name;
        this.booksWritten = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(int booksWritten) {
        this.booksWritten = booksWritten;
    }
    
    public void incrementBooksWritten(){
        this.booksWritten++;
    }

    @Override
    public String toString() {
        return  "\nAutor: " + this.name + 
                ", Número de livros escritos: " + this.booksWritten;
    }
    
    
    
}
