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
public class TrianguloFigura extends Figura{
    private float base;
    private float altura;
    
    public TrianguloFigura(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float area(){
        return (base * altura)/2;
    }
}
