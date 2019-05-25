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


public class HexagonoFigura extends Figura{
    private float perimetro;
    private float apotema;
    
    public HexagonoFigura(float perimetro, float apotema){
        this.apotema = apotema;
        this.perimetro = perimetro;
    }
    
    @Override
    public float area(){
        return (perimetro * apotema)/2;
    }
    
}
