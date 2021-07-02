/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8abstract;

/**
 *
 * @author Juárez Terrazas Al Nair
 */
public class p8abstract {
    public static void main(String[] args) {
        Poligono poligono;//varialbe que apunta a objeto
        poligono = new Cuadrilatero();
        System.out.println(poligono); 
        
        poligono = new Triangulo();
        System.out.println(poligono);
        
    }
}
