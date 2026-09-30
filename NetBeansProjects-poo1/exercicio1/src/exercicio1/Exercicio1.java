/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exercicio1;
import java.util.Scanner;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner maxVetor = new Scanner(System.in);
        int n = maxVetor.nextInt();
        
        float[] vetor = new float[n];
        
        for(int i = 0; i < n; i++){
           
            vetor[i] = maxVetor.nextFloat();
            
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(vetor[i] + "");
        }
        
        
    }
    
}
