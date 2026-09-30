/*Gabarito da Prova 2 de Java eleborado na aula de Fábrica de Software
do dia 01/06/2023*/

package fs.prova2;

/**
 *
 * @author ivansuptitz
 */
public class Comercio extends Empresa {

    public Comercio(String cnpj, String nome, String endereco, EComercio tipo) {
        super(cnpj, nome, endereco);//precisa ser a primeira
        
        this.tipoComercio=tipo;
    }

    public EComercio getTipoComercio() {
        return tipoComercio;
    }
    
    //definindo o enumerador
    public enum EComercio {ATACADO, VAREJO}
    
    //declarando um atributo do tipo 'EComercio'
    private EComercio tipoComercio;
    
    @Override
    public String toString(){
        String ret= super.toString();//chamando o método da classe Empresa
        ret += ", Tipo de Comércio: " + tipoComercio;
        return ret;
    }
    
}
