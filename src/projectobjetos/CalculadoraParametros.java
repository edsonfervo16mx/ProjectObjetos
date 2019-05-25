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
public class CalculadoraParametros {
    public int suma(int... numeros){
        int suma = 0;
        
        System.out.println(numeros.length);
        
        for(int numero :  numeros){
            suma += numero;
        }
        
        return suma;
    }
    
    public float suma(float... numeros){
        int suma = 0;
        
        System.out.println(numeros.length);
        
        for(float numero :  numeros){
            suma += numero;
        }
        
        return suma;
    }
    
    public double suma(double... numeros){
        int suma = 0;
        
        System.out.println(numeros.length);
        
        for(double numero :  numeros){
            suma += numero;
        }
        
        return suma;
    }
}
