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
public abstract class Figura {
    private int numeroLados;
    
    public Figura(){
        this.numeroLados = 0;
    }
    
    public abstract float area();//es un metodo abstracto
    
}
