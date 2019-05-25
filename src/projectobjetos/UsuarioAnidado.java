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
public class UsuarioAnidado {
    public String username;
    
    public UsuarioAnidado(String username){
        this.username = username;
    }
    
    public void establecerRol(){
        Administrador admin = new Administrador();
        admin.trabajar();
    }
    
    public class Administrador {
        public void trabajar(){
            System.out.println("El administrador "+username+"  se encuentra trabajando!");
        }
    }
}
