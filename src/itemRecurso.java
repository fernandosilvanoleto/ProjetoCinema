
public class itemRecurso {
    int qtRecurso;
    Recurso r;
    
    public itemRecurso(){}
    public itemRecurso(Recurso r){
        
    }
    public itemRecurso(int qtRecurso, Recurso r)
    {
        this.qtRecurso = qtRecurso;
        this.r = r;
    }

    public int getQtRecurso() {
        return qtRecurso;
    }

    public void setQtRecurso(int qtRecurso) {
        this.qtRecurso = qtRecurso;
    }


    public Recurso getR() {
        return r;
    }

    public void setR(Recurso r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "itemRecurso{" + "qtRecurso=" + qtRecurso + ", r=" + r + '}';
    }
    
}
