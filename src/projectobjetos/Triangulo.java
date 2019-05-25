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
public class Triangulo {
    float base;
    float altura;
    
    void asignarValor(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    float area(){
        float area = (this.base * this.altura)/2;
        return area;
    }
    
}
