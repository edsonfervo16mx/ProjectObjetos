/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectobjetos;

/**
 *
 * @author Fernando
 */
public class Circulo {
    public static final float pi = 3.14165926535f; // static permite acceder al valor de la clase, sin crear el objeto o instancia
    public float radio = 0f; // Se debe instancear debido a que no es static
    
    //final es una palabra reservada que no permite el cambio de valor en una variable
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public static float area(float radio){
        return Circulo.pi * (radio * radio);
    }
}
