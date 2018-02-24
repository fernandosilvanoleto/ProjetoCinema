
public class Data {
	
    private int dia, mes, ano;
    
    //construtor padrão
    public Data(){}

   //Construtor de cópia         
    public Data(Data dt){
        dia = dt.dia;
        mes = dt.mes;
        ano = dt.ano;
    }    

  //Construtor parametrizado    
    public Data(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }    
    	
    //Construtor parametrizado
    public Data(String data){
       String[] vet = data.split("/");       
       if (vet.length == 3)
       {
            try{
                    this.dia = Integer.parseInt(vet[0]);
                    this.mes = Integer.parseInt(vet[1]);
                    this.ano = Integer.parseInt(vet[2]);      			
            }catch(NumberFormatException e)
            {
                    System.err.println("Erro no formato da data: " + e.toString() + " Objeto foi criado e não inicializado");
            }
       } else
       	System.err.println("Erro no formato da data. Objeto foi criado e não inicializado");       
    }
                   
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
 
    public void setData(String data){
       String[] vet = data.split("/");       
       if (vet.length == 3)
       {
            try{
                    this.dia = Integer.parseInt(vet[0]);
                    this.mes = Integer.parseInt(vet[1]);
                    this.ano = Integer.parseInt(vet[2]);      			
            }catch(NumberFormatException e)
            {
                    System.err.println("Erro no formato da data: " + e.toString() + " Valores não atribuídos.");
            }
       } else
       		System.err.println("Erro no formato da data.  Valores não atribuídos.");       
    }
     
    public boolean eIgual(Data d){
        return (this.dia == d.dia && this.mes == d.mes && this.ano == d.ano);        
    }

    public boolean eIgual(String  data){
            return data.equals(this.getData());
    }
    
     public boolean eIgual(int dia, int mes, int ano){
            return this.dia==dia && this.mes==mes && this.ano==ano;
     }
     
     public String getData() {
        return dia + "/" + mes +"/" +ano;
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
}
