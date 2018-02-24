import java.util.Date;
import java.util.Calendar;

public class Usuario {
    
    int codUsuario, nTurma;
    String nome, telefone;
    Date dataNasc;
   
    public Usuario()
    {
        dataNasc = new Date();
    }
    public Usuario(String nome, int codUsuario, int nTurma, String telefone, String dataNasc)
    {
        this.nome = nome;
        this.codUsuario = codUsuario;
        this.dataNasc = new Date(dataNasc);
        this.telefone = telefone;
        this.nTurma = nTurma;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getnTurma() {
        return nTurma;
    }

    public void setnTurma(int nTurma) {
        this.nTurma = nTurma;
    }
    
    

    @Override
    public String toString() {
        return "codUsuario=" + codUsuario + ", nome=" + nome + ", telefone=" + telefone + ", dataNasc=" + dataNasc + '}';
    }
    
}
