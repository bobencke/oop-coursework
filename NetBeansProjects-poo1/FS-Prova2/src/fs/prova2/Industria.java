/*Gabarito da Prova 2 de Java eleborado na aula de Fábrica de Software
do dia 01/06/2023*/

package fs.prova2;

/**
 *
 * @author ivansuptitz
 */
public class Industria extends Empresa implements IPI {
    
    public Industria(String cnpj, String nome, String endereco, EIndustria tipo){
        super(cnpj, nome, endereco);
        
        this.tipoIndustria=tipo;
    }

    @Override
    public double calcularIPI(double base) {
        return base * PERCENTUAL_IPI / 100;
    }

    public EIndustria getTipoIndustria() {
        return tipoIndustria;
    }
    //criando o enumerador
    public enum EIndustria {PRODUCAO, INTERMEDIARIA, CONSUMO}
    
    private EIndustria tipoIndustria;
    
    @Override
    public String toString(){
        String ret= super.toString();//chamando o método da classe Empresa
        ret += ", Tipo de Indústria: " + tipoIndustria;
        return ret;
    }    
    
}
