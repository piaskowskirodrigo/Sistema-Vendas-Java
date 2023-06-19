
package classes;


public class Usuario {
    private String idUsuario;
    private String idNome;
    private String snome;
    private String senha;
    private int perfil;

    public Usuario(String idUsuario, String idNome, String snome, String senha, int perfil) {
        this.idUsuario = idUsuario;
        this.idNome = idNome;
        this.snome = snome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdNome() {
        return idNome;
    }

    public void setIdNome(String idNome) {
        this.idNome = idNome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    
    
}
