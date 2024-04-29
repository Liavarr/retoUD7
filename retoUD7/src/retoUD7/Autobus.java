package retoUD7;

public class Autobus extends Vehiculo {
	//ATRIBUTOS
	private int numero;
	private int numeroParadas;
	
	//CONSTRUCTORES
	public Autobus() {
		
	}
	
	public Autobus(String marca, String modelo, String numeroBastidor, int numeroPuertas, int numero, int numeroParadas) {
		super(marca, modelo, numeroBastidor, numeroPuertas);
		this.numero=numero;
		this.numeroParadas=numeroParadas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroParadas() {
		return numeroParadas;
	}

	public void setNumeroParadas(int numeroParadas) {
		this.numeroParadas = numeroParadas;
	}
	
	//toString
	public String mostrarVehiculo() {
		System.out.println("**MOSTRANDO AUTOBUS**");
		return super.mostrarVehiculo()+"; Número: "+this.getNumero()+"; Número de paradas:"+this.getNumeroParadas();
	}

}
