
public class Revista extends Recurso {
    
    String mes, categoria, editora;
    int numEdicao;
    
    public Revista(){}
    public Revista(String nome, int codRecurso, int ano, String mes, String categoria, String editora, int numEdicao)
    {
        super(nome, codRecurso, ano);
        this.categoria = categoria;
        this.editora = editora;
        this.numEdicao = numEdicao;
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    @Override
    public String toString() {
        return "Revista{" + "mes=" + mes + ", categoria=" + categoria + ", editora=" + editora + ", numEdicao=" + numEdicao + '}';
    }
    
    
}
