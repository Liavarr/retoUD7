package retoUD7;

public abstract class Turismo extends Vehiculo{
	//Atributos
	private TiposAsiento tipoAsiento;
	
	//Constructores
	public Turismo() {
		
	}
	
	public Turismo(String marca, String modelo, String numeroBastidor, int numeroPuertas, TiposAsiento tipoAsiento) {
		super(marca, modelo, numeroBastidor, numeroPuertas);
		this.tipoAsiento = tipoAsiento;
	}
	
	//GETTER Y SETTER
	public TiposAsiento getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(TiposAsiento tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	
	//Metodo toString
	public String mostrarVehiculo() {
		return super.mostrarVehiculo()+"; tipo de asiento: "+this.getTipoAsiento();
	}
	
	//Metodo abstracto calcular precio alquiler
	abstract double calcularPrecioAlquiler(double numDias);//Taxi este precio será 50€ mientras que cuando el método se implementa en la clase Particular el precio será de 30€
	abstract int getMaxVelocidad();//En el caso de Taxi devolverá una velocidad máxima de 200 y en el caso de un Particular una velocidad máxima de 220.
}
