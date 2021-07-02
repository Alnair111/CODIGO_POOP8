/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8interfaz;

/**
 *
 * @author Juárez Terrazas Al Nair
 */
public class p8interfaz {
    public static void main(String[] args) {
        //se crea referencia de interfaz
        InstrumentoMusical instrumento;
        //pero no es posible crear una instancia de una interfaz
        //instrumento = new InstrumentoMusical(); x
        
        //Una referencia de interfaz puede ser asignada a
        //Cualquier objeto que la implemente
        
        instrumento = new InstrumentoViento();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        instrumento = new Flauta();
        System.out.println(instrumento.tipoInstrumento());
    }
}
