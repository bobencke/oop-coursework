/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeprova2;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Industria extends Empresa implements IPI{

    @Override
    public float calaularIPI(float base) {
        return base * PERCENTUAL_IPI / 100;
    }
    
}
