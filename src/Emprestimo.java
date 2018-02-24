import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Emprestimo {
    private int codEmprestimo;
    private Date dataEmprestimo, dataLimite;
    private Usuario u;
    private itemRecurso i;
    ArrayList<itemRecurso> itens = new ArrayList();
    
    public Emprestimo(){
        dataEmprestimo = new Date();
        dataLimite = calculaDataLimite(this.dataEmprestimo, u);
        i = new itemRecurso();
    }
    public Emprestimo(int codEmprestimo, String dataEmprestimo, Usuario u) 
    {
        this.codEmprestimo = codEmprestimo;
        this.dataEmprestimo = new Date(dataEmprestimo);
        this.u = u; 
        dataLimite = calculaDataLimite(this.dataEmprestimo,u);
    }

    public int getCodEmprestimo() {
        return codEmprestimo;
    }

    public ArrayList<itemRecurso> getItens() {
        return itens;
    }

    public void setCodEmprestimo(int codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Usuario getU() {
        return u;
    }
    
    public void insereItemRecurso(int qtd, Recurso r)
    {
        itemRecurso i = new itemRecurso(qtd, r);
        itens.add(i);      
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public itemRecurso getI() {
        return i;
    }


    public Date getDataLimite() {
        return dataLimite;
    } 

    public void setDataLimite(Date dataEmprestimo, Usuario u) {
        this.dataLimite = calculaDataLimite(dataEmprestimo, u);
    }
   
  public Date calculaDataLimite(Date dataEmprestimo, Usuario u)
    {
        if(u instanceof Professor)
        {
            dataLimite = dataEmprestimo;
            return dataLimite;   
        }
        else
        {
            dataLimite = dataEmprestimo;
            return dataLimite;     
        }
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "codEmprestimo=" + codEmprestimo + ", dataEmprestimo=" + dataEmprestimo + ", dataLimite=" + dataLimite + ", u=" + u + ", i=" + i + ", itens=" + itens + '}';
    }
  
  
}
