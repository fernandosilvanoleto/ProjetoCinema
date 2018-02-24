import java.util.Date;
import java.util.Calendar;

public class Professor extends Usuario{
    
    private int nTurma;
    private String cpf;
    private boolean estahPartic;
    private static double valorFixo, taxaPart;
    
    
    public Professor(){}
    public Professor(String nome, String cpf, int codUsuario, int nTurma, String telefone, String dataNasc, boolean estahPartic)
    {
        super(nome, codUsuario,nTurma, telefone, dataNasc);
        this.cpf = cpf;
        this.nTurma = nTurma;
        this.estahPartic = estahPartic;
    }

    public int getnTurma() {
        return nTurma;
    }

    public void setnTurma(int nTurma) {
        this.nTurma = nTurma;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean EstahPartic() {
        return estahPartic;
    }

    public void setEstahPartic(boolean estahPartic) {
        this.estahPartic = estahPartic;
    }

    public static double getValorFixo() {
        return valorFixo;
    }

    public static void setValorFixo(double valorFixo) {
        Professor.valorFixo = valorFixo;
    }

    public static double getTaxaPart() {
        return taxaPart;
    }

    public static void setTaxaPart(double taxaPart) {
        Professor.taxaPart = taxaPart;
    }

    @Override
    public String toString() {
        return "nTurma=" + nTurma + ", cpf=" + cpf + ", estahPartic=" + estahPartic + '}';
    }
    
    
}
