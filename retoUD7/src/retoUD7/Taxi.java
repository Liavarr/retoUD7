package retoUD7;

public class Taxi extends Turismo implements Iniciable, Calculable {
	//ATRIBUTOS
	final double IMPORTE_INICIO = 2;
	double kmRecorridos;
	double importeKm;
	
	//CONSTRUCTORES
	public Taxi() {
		
	}
	
	public Taxi(String marca, String modelo, String numeroBastidor, int numeroPuertas, TiposAsiento tipoAsiento, double kmRecorridos, double importeKm) {
		super(marca, modelo, numeroBastidor, numeroPuertas, tipoAsiento);
		this.kmRecorridos=kmRecorridos;
		this.importeKm=importeKm;
	}
	
	
	//GETTER Y SETTER
	
	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
	}

	public double getIMPORTE_INICIO() {
		return IMPORTE_INICIO;
	}
	
	//Interfaces
	@Override
	public double calcularPrecioAlquiler(double numDias) {
		double total = numDias * 50;
		return total;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	public double calcularCosteTrayecto(double importeInicio, double kmRecorridos, double importeKm) {
		// TODO Auto-generated method stub
		return importeInicio + (kmRecorridos * importeKm);
	}
	
	@Override
	public void reiniciarContador(double kilometros) {
		System.out.println("El taxi tiene acumulados un total de "+kilometros+" kilometros");
	}

	
	//METODO TO STRING
	public String mostrarVehiculo() {
		System.out.println("**MOSTRANDO TAXI**");
		return super.mostrarVehiculo()+ "; Importe inicial: "+this.getIMPORTE_INICIO()+"; Importe KM "+this.getImporteKm()+
				"; KM recorridos: "+this.getKmRecorridos()+"; Coste del trayecto = "+
				this.calcularCosteTrayecto(this.getIMPORTE_INICIO(), this.getKmRecorridos(), this.getImporteKm());
	}

}
