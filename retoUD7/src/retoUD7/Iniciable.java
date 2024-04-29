package retoUD7;

public interface Iniciable {
	//Se utiliza para resetear el cuentakilómetros e indicar que el vehículo parte 
	//de un kilometraje inicial (lo recibe como parámetro). Se mostrará un mensaje que indica estos kilómetros. 
	//Este método será implementado de diferente forma en la clase Taxi y Turismo, en Taxi deberá indicar 
	//que se trata de un Taxi y en Particular que se trata de un Particular.
	void reiniciarContador(double kilometros);
}
