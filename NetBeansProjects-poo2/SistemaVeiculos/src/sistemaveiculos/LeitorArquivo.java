/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaveiculos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class LeitorArquivo {
    
    public static List<Veiculo> lerArquivo(String caminhoArquivo){
        
        List<Veiculo> veiculos = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
            
          String linha;
          
          while((linha = br.readLine()) != null){
              
              String[] dados = linha.split(";");
              
              String tipo = dados[0];
              String marca = dados[1];
              String modelo = dados[2];
              int ano = Integer.parseInt(dados[3]);
              
              switch (tipo.toUpperCase()) {
                  
                case "CARRO":
                    
                      int portas = Integer.parseInt(dados[4]);
                      veiculos.add(new Carro(marca, modelo, ano, portas));
                      break;
                        
                case "MOTO":
                    
                    int cilindradas = Integer.parseInt(dados[4]);
                    veiculos.add(new Moto(marca, modelo, ano, cilindradas));
                    break;
                        
              }   
              
          }
            
        }catch(Exception e){
            System.out.println("Não foi possível ler o arquivo.");
        }
        
        return veiculos;
    
    }    
        
}
