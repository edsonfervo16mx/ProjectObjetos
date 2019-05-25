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
public class MascotaHerencia {
    String nombre;
    String raza;
    int edad;
    
    public MascotaHerencia(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    void establecerAtributos(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    void comer(){
        System.out.println("La mascota está comiendo");
    }
    
    void dormir(){
        System.out.println("La mascota está durmiendo");
    }
}
