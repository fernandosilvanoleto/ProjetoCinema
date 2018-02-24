
import java.util.Date;


public class Sessao {
    int qtd, codSessao;
    Date dataSessao;
    String hora, strDataSessao;
    Recurso filme;
   
    public Sessao(){}
    public Sessao(int codSessao, String strDataSessao, String hora, Recurso filme, int qtd){
        this.codSessao = codSessao;
        this.strDataSessao = strDataSessao;
        this.dataSessao = new Date(strDataSessao);
        this.hora = hora;
        this.filme = filme;
        this.qtd = qtd;
    }
    

    public int getCodSessao() {
        return codSessao;
    }

    public void setCodSessao(int codSessao) {
        this.codSessao = codSessao;
    }

    
    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStrDataSessao() {
        return strDataSessao;
    }

    public void setStrDataSessao(String strDataSessao) {
        this.strDataSessao = strDataSessao;
    }

    public Recurso getFilme() {
        return filme;
    }

    public void setFilme(Recurso filme) {
        this.filme = filme;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Sessao{" + "qtd=" + qtd + ", codSessao=" + codSessao + ", dataSessao=" + dataSessao + ", hora=" + hora + ", strDataSessao=" + strDataSessao + ", filme=" + filme + '}';
    }

    
}
