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
//Clase hija de la clase MascotaHerencia
public class GatoHerencia extends MascotaHerencia{
    public GatoHerencia(String nombre, String raza, int edad){
        /*
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        /**/
        super(nombre,raza,edad);
    }
    
    //@Override es para sobre escribir la clase y funcionalidad.
    @Override
    public void dormir(){
        System.out.println("El gato duerme!");
    }
    
    
    
}
