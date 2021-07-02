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
public interface InstrumentoMusical {
    //todos los metodos definidos dentro de una interface
    //son publicos y abstractos
    
    void tocar ();
    
    void afinar();
    
    String tipoInstrumento();
    
}
