/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryproject;

import java.util.Scanner;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class LibraryProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Library lib = new Library();
        
        while(true){
            
            System.out.println("O que deseja realizar?\n");
            System.out.println("1- Consultar todos os livros.");
            System.out.println("2 - Consultar o total de livros.");
            System.out.println("3- Consultar autores e quantidade de obras.");
            System.out.println("4 - Cadastrar um novo livro.");
            System.out.println("5 - Remover um livro existente.\n");
            
            System.out.print("Resposta: ");
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();

            switch(choice){
                case 1:
                    lib.getAllBooks();
                    break;
                case 2:
                    lib.getTotalOfBooks();
                    break;
                case 3:
                    lib.getBookByAuthor();
                    break;
                case 4:
                   lib.addBook();
                   break;
                case 5:
                   lib.removeBook();
                   break;
                default:
                    System.out.println("\nInsira uma opção válida\n");
                    break;

            }
             
        }
        
    }
    
}
