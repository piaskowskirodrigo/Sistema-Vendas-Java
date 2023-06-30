
package classes;

public class Dados {
   private int maxUsu = 50;
   private  Usuario msUsuarios[]= new Usuario[maxUsu];
   private int conUsu = 0;
    
    public Dados(){
        Usuario mUsuario;
        mUsuario = new Usuario("san1","san1","san2","123",1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("san2","san1","san2","123",2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario("san3","san1","san2","123",1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
    }
    
    public int numeroUsuarios(){
        return conUsu;
    }
    
    public Usuario[] getUsuarios(){
        return msUsuarios;
    }
        
    
    public boolean validarUsuario(String usuario,String senha){
        boolean aux = false;
        for(int i = 0; i <conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)&& 
                    msUsuarios[i].getSenha().equals(senha)){
            return true;
        }
                   
        }
        return false;
    }


     public int posicaoUsuario(String usuario){
        
        for(int i = 0; i <conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)){
            return i;
        }
                   
        }
        return -1;
    }
     public String adicionarUsuario(Usuario mUsuario){
         if(conUsu == maxUsu){
             return  "Nao e possivel cadastrar mais usuarios!";
         }
         msUsuarios[conUsu] = mUsuario;
         conUsu ++;
         return  "Usuario cadastrado com sucesso!";
     }
     public String editarUsuario(Usuario mUsuario, int pos){
         msUsuarios[pos].setIdNome(mUsuario.getIdNome());
         msUsuarios[pos].setSnome(mUsuario.getSnome());
         msUsuarios[pos].setSenha(mUsuario.getSenha());
         msUsuarios[pos].setPerfil(mUsuario.getPerfil());
         
         return  "Usuario editado com sucesso!";
       
     }
     //deleta usuario
     public String deletarUsuario(int pos){
         for (int i = pos; i <conUsu -1;i ++){
             msUsuarios[i]=msUsuarios[i + 1];
         }
         conUsu--;
         return  "Usuario deletado com sucesso!";
     }
}