package retoUD7;

public abstract class Vehiculo {
	//ATRIBUTOS Y Contador vehiculos funcionando:
	private String marca;
	private String modelo;
	private String numeroBastidor;
	private int numeroPuertas;
	private static int cantidadVehículosFuncionando;
	
	//CONSTRUCTORES
	protected Vehiculo() {
		//Sumar vehiculo
		cantidadVehículosFuncionando++;
	}
	
	protected Vehiculo(String marca, String modelo, String numeroBastidor, int numeroPuertas) {
		this.marca=marca;
		this.modelo=modelo;
		this.numeroBastidor=numeroBastidor;
		this.numeroPuertas=numeroPuertas;
		//Sumar vehiculo
		cantidadVehículosFuncionando++;
	}
	
	
	//Getter y Setter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public static int getCantidadVehículosFuncionando() {
		return cantidadVehículosFuncionando;
	}

	public static void setCantidadVehículosFuncionando(int cantidadVehículosFuncionando) {
		Vehiculo.cantidadVehículosFuncionando = cantidadVehículosFuncionando;
	}
	
	//toString
	public String mostrarVehiculo() {
		return "Marca: "+this.getMarca()+"; modelo: "+this.getModelo()+"; Nbastidor: "+this.getNumeroBastidor()+"; Npuertas:"+this.getNumeroPuertas();
	}
}
