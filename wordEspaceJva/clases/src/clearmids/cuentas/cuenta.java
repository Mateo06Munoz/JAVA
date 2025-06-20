package clearmids.cuentas;

public class cuenta {
    private String id;
    private String tipo;
    private double saldo;
    
    public cuenta(String id) {
    	this.id=id;
    	tipo="A";
    }
    public cuenta(String id,String tipo,double saldo) {
    	this.id=id;
    	this.tipo=tipo;
    	this.saldo=saldo;
    }
    	
    
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    public void imprimir () {
    	System.out.println("*************************");
    	System.out.println("CUENTA");
     	System.out.println("*************************");
     	System.out.println("Número de cuenta: "+id);
     	System.out.println("Tipo: "+tipo);
     	System.out.println("Saldo: "+saldo);
    }
    public void imprimirConMiEstilo () {
    	System.out.println("____________________________");
    	System.out.println("CUENTA");
    	System.out.println("____________________________");
     	System.out.println("Número de cuenta");
    	System.out.println(id);
    	System.out.println("____________________________");
     	System.out.println("Tipo");
    	System.out.println(tipo);
    	System.out.println("____________________________");
     	System.out.println("Saldo");
    	System.out.println(saldo);
    	System.out.println("____________________________");
    }
    
}
