/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author Juárez Terrazas Al Nair
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objetos
       Poligono poligono = new Poligono();//objeto
       Cuadrilatero cuadrilatero= new Cuadrilatero();
       Triangulo triangulo = new Triangulo();
       
        System.out.println(poligono);
        System.out.println(cuadrilatero);
        System.out.println(triangulo);
        //variables
        Poligono pol;//variable que va a apuntar un objeto poligono
        pol =new Poligono();
        System.out.println(pol);
        
        Object objeto; //variable objeto de tipo object
        objeto = pol;//vairalbe que tiene una referecnaia que apunta a un objeto
        System.out.println(objeto);
        
        pol = triangulo;
        System.out.println("**************************");
        System.out.println(pol);
        System.out.println(objeto);
        
        System.out.println("######################### EJ2 #########################");
        getPoligono(cuadrilatero);
        getPoligono(triangulo);
        getPoligono(poligono);
        
    }
    
    public static void getPoligono(Poligono p){//las vairalbes estaticas no cambian 
        if (p instanceof Triangulo){
               System.out.println("Esto es un triangulo");
        }else if (p instanceof Cuadrilatero){
        System.out.println("Esto es un cuadrilatero");
        }else{
            System.out.println("Es un poligono"); 
        }
        
    }
    
}
