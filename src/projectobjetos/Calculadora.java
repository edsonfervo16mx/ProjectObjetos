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
public class Calculadora {
    //Sobrecarga de metodos
    
    //Enteros
    public int suma(int valor1, int valor2){
        return valor1 + valor2;
    }
    
    //Enteros
    public int suma(int valor1, int valor2, int valor3){
        return valor1 + valor2 + valor3;
    }
    
    //Enteros
    public int suma(){
        return 0;
    }
    
    //Flotantes
    public float suma(float valor1, float valor2){
        return valor1 + valor2;
    }
    
    //Doubles
    public double suma(double valor1, double valor2){
        return valor1 + valor2;
    }
    
}
