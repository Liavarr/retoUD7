package retoUD7;

public class Particular extends Turismo implements Iniciable{
	//ATRIBUTOS
	String propietario;
	boolean conAireAcondicionado;
	double kmRecorridos;
	
	public Particular () {
		
	}
	
	public Particular(String marca, String modelo, String numeroBastidor, int numeroPuertas, TiposAsiento tipoAsiento,double kmRecorridos, String propietario, boolean conAireAcondicionado) {
		super(marca, modelo, numeroBastidor, numeroPuertas, tipoAsiento);
		this.kmRecorridos=kmRecorridos;
		this.propietario=propietario;
		this.conAireAcondicionado=conAireAcondicionado;
	}
	
	//GETTER Y SETTERS
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String isConAireAcondicionado() {
		if (this.conAireAcondicionado) {
			return "sí";
		} else {
			return "no";
		}
		
	}

	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}
	
	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	
	//INTERFACES
	@Override
	public double calcularPrecioAlquiler(double numDias) {
		double total = numDias * 30;
		return total;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 220;
	}
	
	@Override
	public void reiniciarContador(double kilometros) {
		this.setKmRecorridos(kilometros);
		System.out.println("El particular tiene acumulados un total de "+kilometros+" kilometros");
	}

	//metodo toString
	public String mostrarVehiculo() {
		System.out.println("**MOSTRANDO PARTICULAR**");
		//return super.mostrarVehiculo()+"; Propietario: "+this.propietario+"; Aire acondicionado:"+this.isConAireAcondicionado();
		return super.mostrarVehiculo()+ "; KM recorridos:"+this.getKmRecorridos()+
				"; Propietario: "+this.propietario+"; Aire acondicionado: "+this.isConAireAcondicionado();
	}
	
}
