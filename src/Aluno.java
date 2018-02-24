import java.util.Date;
import java.util.Calendar;

public class Aluno extends Usuario {
    
    String nomePai, nomeMae;
    
    public Aluno()
    {
        dataNasc = new Date();
        
    }
    public Aluno(String nome, int codUsuario, int nTurma, String telefone, String dataNasc, String nomePai,String nomeMae)
    {
        super(nome, codUsuario, nTurma, telefone, dataNasc);
        this.nomePai= nomePai;
        this.nomeMae = nomeMae;
        this.dataNasc = new Date(dataNasc);
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    
    @Override
    public String toString() {
        return "nomePai=" + nomePai + ", nomeMae=" + nomeMae + '}';
    }
    
      
}
