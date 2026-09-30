/*Gabarito da Prova 2 de Java eleborado na aula de Fábrica de Software
do dia 01/06/2023*/

package fs.prova2;

import fs.prova2.Comercio.EComercio;
import fs.prova2.Industria.EIndustria;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivansuptitz
 */
public class FSProva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empresa> lst = new ArrayList<>();
        System.out.println("Quantas empresas vamos gerar? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Empresa e;
            if(i%2 == 0){//se for par
                e = new Industria("12.345.456-89", "ACME", "Rua qualquer, 555", EIndustria.CONSUMO);
            }
            else{//se for impar
                e = new Comercio("12.345.456-89", "Comercio Bom", "Rua qualquer, 666", EComercio.VAREJO);
            }
            lst.add(e);
            
            for (int j = 0; j < 3; j++) {
                e.efetuarVenda(2, 9.99);
            }            
        }
        
        //novo laço para imprimir e totalizar
        double totGerVendas=0;
        double totlGerImpostos=0;
        for (int i = 0; i < lst.size(); i++) {
            Empresa e = lst.get(i);
            System.out.println(e.toString());
            System.out.println("------------------------");
            
            //acumulando os totais
            totGerVendas += e.getTotalVendas();
            totlGerImpostos += e.getTotalImpostos();
        }
        //imprimir o resultado final
        System.out.printf("Total Geral de Vendas: R$ %.2f\n", totGerVendas);
        System.out.printf("Total Geral de Impostos: R$ %.2f\n", totlGerImpostos);
    }
    
}
