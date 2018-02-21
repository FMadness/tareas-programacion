/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author josem
 */
public class Linea {
    private Punto inicio;
    private Punto fin;
    public Linea(Integer x1, Integer x2, Integer y1, Integer y2){
        this.inicio=new Punto(x1,y1);
        this.fin=new Punto(x2,y2);
        
    }
}
