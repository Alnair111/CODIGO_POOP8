/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8interfaz;

/**
 *
 * @author Alna
 */
public class InstrumentoViento implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando  intrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando  intrumento de viento");
    }

    @Override
    public String tipoInstrumento() {
        return  "intrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
