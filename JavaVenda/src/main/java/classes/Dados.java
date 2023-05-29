/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author piask
 */
public class Dados {
    public boolean validarUsuario(String usuario,String senha){
        if(usuario.equals("rodrigo")&& senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
    
}
