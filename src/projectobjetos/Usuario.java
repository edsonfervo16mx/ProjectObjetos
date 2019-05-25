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
public class Usuario {
    public String username;
    private String password;
    
    //Modificadores de accesos
    /*
    Default -> Pueden ser consultados, modificados y ejecutados desde cualquier lugar del proyecto
    Public -> Pueden ser consultados, modificados y ejecutados desde cualquier lugar del proyecto (Paquetes y Clases)
    Private -> Permite consultar, modificar y ejecutar unicamente desde la misma clase
    Protected
    /**/
    
    //Constructor
    public Usuario(String username,String password){
        //System.out.println("Creacion de un nuevo objeto");
        this.username = username;
        this.password = password;
    }
    
    public void saluda(){
        System.out.println("Hola mi nombre de usuario es: "+ this.username);
    }
    
    //Getter
    public String getPassword(){
        return this.password;
    }
    
    //Setter
    public void setPassword(String password){
        this.password = password;
    }
    
}
