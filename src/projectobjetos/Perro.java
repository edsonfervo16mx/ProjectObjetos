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
public class Perro {
    String nombre;
    String raza;
    int edad;
    
    void establecerAtributos(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    void comer(){
        System.out.println("El perro está comiendo");
    }
    
    void ladrar(){
        System.out.println("Guau Guau Guau...");
    }
    
    void dormir(){
        System.out.println("El perro está dormido");
    }
    
}
