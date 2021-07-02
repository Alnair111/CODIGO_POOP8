/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop8;

/**
 *
 * @author Alna
 */
public class Triangulo extends Poligono{
    
    private int alfa,veta,gama;
    private float a,b,c;
    private float base,altura;

    public Triangulo() {
    }

    
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+ "Ttriangulo{" + "alfa=" + alfa + ", veta=" + veta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
