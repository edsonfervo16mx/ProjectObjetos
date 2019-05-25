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
public class ProjectObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro firulais = new Perro();
        
        firulais.establecerAtributos("Firulais", "Callejero", 5);
        
        /*
        firulais.nombre = "Firulais";
        firulais.raza = "Callejero";
        firulais.edad = 5;
        /**/

        System.out.println("Su nombre es: "+ firulais.nombre);
        System.out.println("Su raza es: "+ firulais.raza);
        System.out.println("Su edad es: "+ firulais.edad);
        
        firulais.comer();
        firulais.ladrar();
        firulais.dormir();
        
        //-----------------------------
        Triangulo triangulo = new Triangulo();
        triangulo.asignarValor(10, 20);
        
        float resultado = triangulo.area();
        System.out.println(resultado);
        
        //-----------------------------
        Usuario edsonfer = new Usuario("edsonfer","qwerty");
        
        //edsonfer.username = "edsonfer";
        //edsonfer.password = "123456";
        
        System.out.println(edsonfer.username);
        //System.out.println(edsonfer.password);
        
        edsonfer.saluda();
        
        //Aplicando Setter y Getter
        //edsonfer.setPassword("123456");
        System.out.println(edsonfer.getPassword());
        
        //-----------------------------
        Calculadora operacion = new Calculadora();
        
        //float r = operacion.suma(10.1f, 20.5f);
        //int r = operacion.suma(10, 60, 20);
        int r = operacion.suma();
        
        System.out.println("El resultado es: "+ r);
        
        //------------------------------
        
        CalculadoraParametros operacionAtributos = new CalculadoraParametros();
        
        int res = operacionAtributos.suma(5,8,7,9,10,11);
        System.out.println("El resultado de la operacion con Atributos es: "+ res);
        
        
        //-------------------------------
        //Static
        
        Circulo c = new Circulo(1f);
        
        System.out.println(c.pi);
        
        //Con el metodo estatico no se necesita hacer una instancia
        
        System.out.println(Circulo.area(125f));
        
        //En resumen static permite utilizar los metodos de la clase sin instancear el objeto y/o sus metodos
        
        
        //-------------------------------------
        //Clases anidadas
        
        UsuarioAnidado usuarioanidado = new UsuarioAnidado("ligalombarda");
        usuarioanidado.establecerRol();
        
        //-------------------------------------
        //Herencia -> Clases padres y clases hijas
        GatoHerencia gatomascota = new GatoHerencia("garfield","Corriente",2);
        PerroHerencia perromascota = new PerroHerencia("garfield","Corriente",2);
        
        gatomascota.dormir();
        perromascota.dormir();
        
        perromascota.ladrar();
        
        
        //----------------------------------
        //Abstract
        //Principio de sustitucion
        //Figura figura = new Figura();
        Figura figuras[] = new Figura[2];
        
        Figura hexagono = new HexagonoFigura(5f,2f);
        Figura triangulof = new TrianguloFigura(20f,2f);
        
        figuras[0] = hexagono;
        figuras[1] = triangulof;
        
        System.out.println(figuras[0].area());
        System.out.println(figuras[1].area());
        
    }
    
    
    
}
