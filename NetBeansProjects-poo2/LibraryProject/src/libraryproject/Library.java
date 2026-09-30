/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Library {
    
    private List<Book> books = new ArrayList<>();
    private Map<String, Author> authors = new HashMap<>();
    
    public Library(){
        
        Author a1 = new Author("Jorge Amado");
        authors.put("Jorge Amado", a1);
        
        Author a2 = new Author("Paulo Coelho");
        authors.put("Paulo Coelho", a2);
                
        Author a3 = new Author("Irving Tressler");
        authors.put("Irving Tressler", a3);
        
        Author a4 = new Author("Maíra Lot Micales");
        authors.put("Maíra Lot Micales", a4);
        
        books.add(new Book(1, "Capitães da Areia", Category.FICCAO, a1, "1937"));
        a1.incrementBooksWritten();
        
        books.add(new Book(2, "O Alquimista", Category.FICCAO, a2, "1988"));
        a2.incrementBooksWritten();
        
        books.add(new Book(3, "Como perder amigos e aborrecer pessoas", Category.AUTO_AJUDA, a3, "1946"));
        a3.incrementBooksWritten();
        
        books.add(new Book(4, "Cocô, Xixi e Pum!: Adeus, fralda!", Category.INFANTIL, a4, "2019"));
        a4.incrementBooksWritten();
        
        books.add(new Book(5, "Os Pastores da Noite", Category.FICCAO, a1, "1964"));
        a1.incrementBooksWritten();
    }

    public void addBook(){
        
        try{
            
            System.out.println("\nInsira os dados do livro que deseja adicionar:\n");
        
            System.out.print("ID: ");
            Scanner sc1 = new Scanner(System.in);
            int id = sc1.nextInt();

            System.out.print("Título: ");
            Scanner sc2 = new Scanner(System.in);
            String title = sc2.nextLine();

            System.out.print("Escolha uma entre as seguintes categorias existentes: \n");
            System.out.println("\n\t0 - Didático\n\t1 - Infantil\n\t2 - Ficcção\n\t3 - Auto Ajuda\n");
            System.out.print("Resposta: ");
            Scanner sc3 = new Scanner(System.in);
            int c = sc3.nextInt();
            Category category = Category.values()[c];

            System.out.print("Autor: ");
            Scanner sc4 = new Scanner(System.in);
            String a = sc4.nextLine();

            System.out.print("Data de Lançamento: ");
            Scanner sc5 = new Scanner(System.in);
            String releaseDate = sc2.nextLine();
            
            if( books.size() <= 100){
                
                Author author;
                
                if(authors.containsKey(a)){
                    author = authors.get(a);
                }else{
                    author = new Author(a);
                    authors.put(a, author);
                }
                
                author.incrementBooksWritten();
                
                books.add(new Book(id, title, category, author, releaseDate));
                
            }
            else{
                
                System.out.println("\nJá existem 100 livros registrados. Exclua um para que consiga adicionar outro.\n");
                
            }
        }
        catch(Exception e){
            
            System.out.println("\nNão foi possível adicionar o livro.\n");
            
        }
        
    }
    
    public void removeBook(){
        
        try{
            
            if(books.size() > 0){
                
                System.out.print("\nInsira o ID do livro que deseja remover: ");
                Scanner sc1 = new Scanner(System.in);
                int id = sc1.nextInt();

                int arrayLength = books.size();

                for(Book b : books){

                    if (b.getId() == id){
                        
                        books.remove(b);
                        System.out.println("\nItem excluído com sucesso!\n");
                        
                    }

                }
                
                if( arrayLength == books.size()){
                    
                    System.out.println("\nO ID inserido não é válido.\n");
                
                }

            }else{
                
                System.out.println("\nNão existem livros cadastrados ainda.\n");
                
            }
            
        }catch(Exception e){
            
            System.out.println("\nNão foi possível excluir o livro.\n");
            
        }
        
    }
    
    public void getTotalOfBooks(){
        
        try{
            
            if(books.size() > 0){
                
                System.out.println("\nExistem " + (books.size()) + " livro(s) registrado(s).\n");
                
            }else{
                
                System.out.println("\nNão existem livros cadastrados ainda.\n");
                
            }
     
        }catch(Exception e){
            
            System.out.println("\nNão foi possível realizar a consulta.\n");
            
        }
        
    }
    
    public void getAllBooks(){
        
        try{
            
            if(books.size() > 0){
                
                for(Book b : books){
                    
                    if(books.indexOf(b) == (books.size() - 1)){
                        System.out.println(b);
                        System.out.println();
                    }else{
                        System.out.println(b);
                    }
                    
                }
                
            }else{
                
                System.out.println("\nNão existem livros cadastrados ainda.\n");
                
            }
            
        }catch(Exception e){
            
            System.out.println("\nNão foi possível realizar a consulta.\n");
            
        }
    }
    
    public void getBookByAuthor(){
        
        try{
            
            if(books.size() > 0){
                
                List<Author> authorsCopy = new ArrayList<>(authors.values());
        
                authorsCopy.sort((a1, a2) -> Integer.compare(a2.getBooksWritten(), a1.getBooksWritten()));

                for(Author a : authorsCopy){
                    
                    if(authorsCopy.indexOf(a) == (authorsCopy.size() -1)){
                        
                        System.out.println(a);
                        System.out.println();
                        
                    }else{
                        
                        System.out.println(a);
                        
                    }
 
                    
                }
                
            }else{
                
                System.out.println("\nNão existem livros cadastrados ainda.\n");
                
            }
            
        }catch(Exception e){
            
            System.out.println("\nNão foi possível realizar a consulta.\n");
            
        }
        
    }
    
}
