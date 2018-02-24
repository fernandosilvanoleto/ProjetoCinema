
public class Filme extends Recurso{
    
    String genero, classific;
    
    public Filme(){}
    public Filme(String nome, int codRecurso, int ano, String genero, String classific)
    {
        super(nome, codRecurso, ano);
        this.genero = genero;
        this.classific = classific;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassific() {
        return classific;
    }

    public void setClassific(String classifc) {
        this.classific = classifc;
    }

    @Override
    public String toString() {
        return "Filme{" + "genero=" + genero + ", classific=" + classific + '}';
    }
    
    
    
}
