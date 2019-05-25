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
public class PerroHerencia extends MascotaHerencia{
    public PerroHerencia(String nombre, String raza, int edad){
        /*
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        /**/
        super(nombre,raza,edad);
    }
    
    void ladrar(){
        System.out.println("Guau Guau Guau...");
    }
    
    @Override
    public void dormir(){
        super.dormir(); //Super = Ejecuta el de la clase padre 
        System.out.println("El perro duerme!");
    }
}
