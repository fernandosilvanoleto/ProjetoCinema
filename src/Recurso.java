
public class Recurso {
    
    String nome;
    int codRecurso, ano;
    
    public Recurso(){}
    public Recurso(String nome, int codRecurso, int ano)
    {
        this.nome = nome;
        this.codRecurso = codRecurso;
        this.ano = ano;                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodRecurso() {
        return codRecurso;
    }

    public void setCodRecurso(int codRecurso) {
        this.codRecurso = codRecurso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Recurso{" + "nome=" + nome + ", codRecurso=" + codRecurso + ", ano=" + ano + '}';
    }
    
    
    
}
