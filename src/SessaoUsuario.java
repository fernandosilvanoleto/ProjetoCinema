
public class SessaoUsuario {
    
    Usuario usuario;
    Sessao sessao;
    
    SessaoUsuario(){}
    SessaoUsuario(Usuario u, Sessao s){
        usuario = u;
        sessao = s;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "SessaoUsuario{" + "usuario=" + usuario + ", sessao=" + sessao + '}';
    }     
}
