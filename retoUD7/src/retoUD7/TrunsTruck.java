package retoUD7;

public class TrunsTruck {
	public static void main(String[] args) {
		
		TiposAsiento reclinable = TiposAsiento.RECLINABLES;
		TiposAsiento cuero = TiposAsiento.CUERO;
		TiposAsiento calefaccion = TiposAsiento.CALEFACCION;
		
		//CREACION DE VEHICULOS
		//TAXI
		Taxi taxi1 = new Taxi("Citroen", "Picasso", "ABCDEFGH231411",5, reclinable, 104351.33, 3.00);
		Taxi taxi2 = new Taxi("Toyota","Auris","QWERTYUIOP12345",3, cuero, 134514.03, 4.00);
		
		//PARTICULAR
		Particular particular1 = new Particular("Subaru", "Impreza", "ASDFGHJKLÑZXCV",4, reclinable, 1000.00, "Pablo Sanchez", true);
		Particular particular2 = new Particular("Toyota", "Supra", "78CH31248CB789",5, calefaccion, 1000.00, "Pablo Sanchez", false);
		
		//AUTOBUS
		Autobus autobus1 = new Autobus("Mercedes","EMT","123456789ABCDE",3,16,6);
		
		
		//MOSTRAR TODOS LOS VEHICULOS
		System.out.println(autobus1.mostrarVehiculo());
		System.out.println(taxi1.mostrarVehiculo());
		System.out.println(taxi2.mostrarVehiculo());
		System.out.println(particular1.mostrarVehiculo());
		System.out.println(particular2.mostrarVehiculo());
		
		//MOSTRAR LA CANTIDAD DE VEHICULOS		
		System.out.println("\n**VEHICULOS EN FUNCIONAMIENTO**");
		System.out.println(Vehiculo.getCantidadVehículosFuncionando());
		
		//REINICIAR EL CONTADOR DE TAXI1
		System.out.println("\n**REINICIAMOS LOS KILOMETROS DEL TAXI_1 A 25000**");
		taxi1.reiniciarContador(25000.00);
		System.out.println(taxi1.mostrarVehiculo());
		
		//REINICIAR EL CONTADOR DE PARTICULAR1
		System.out.println("\n**REINICIAMOS LOS KILOMETROS DEL PARTICULAR_1 A 10000**");
		particular1.reiniciarContador(10000.00);
		System.out.println(particular1.mostrarVehiculo());
		
		//PONER UN NUEVO PROPIETARIO A PARTICULAR2
		System.out.println("\n**PONEMOS UN NUEVO PROPIETARIO PARA PARTICULAR_2: PEDRO SANCHEZ**");
		particular2.setPropietario("Pedro Sanchez");
		System.out.println(particular2.mostrarVehiculo());
		
		//Velocidades máximas
		System.out.println("\n**MAXIMA VELOCIDAD DE PARTICULARES**");
		System.out.println(particular1.getMaxVelocidad());
		
		System.out.println("\n**MAXIMA VELOCIDAD DE TAXIS**");
		System.out.println(taxi1.getMaxVelocidad());
	}
}
