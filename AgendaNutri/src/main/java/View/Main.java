
package View;

import Model.Servico;

public class Main {
    
    public static void main(String[] args) {
        Servico servico = new Servico(0, "consulta", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
              
    }
}
