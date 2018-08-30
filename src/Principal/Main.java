package Principal;

import Observador.*;
import Sujeto.*;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new VehiculoConcreto("Primer vehículo");
		Vehiculo v2 = new VehiculoConcreto("Segundo vehículo");
		Vehiculo v3 = new VehiculoConcreto("Tercer vehículo");
		ClienteConcreto cliente1 = new ClienteConcreto("Propietario 1");
		ClienteConcreto cliente2 = new ClienteConcreto("Propietario 2");
		
		System.out.println("Se le asigna a Propietario 1 el primer vehículo");
		cliente1.agregarVehiculo(v1);
		System.out.println("Se le intenta asignar a Propietario 2 el mismo vehículo");
		cliente2.agregarVehiculo(v1);
		System.out.println("Se le asignan a Propietario 2 los otros dos vehículos");
		cliente2.agregarVehiculo(v3);
		cliente2.agregarVehiculo(v2);
		
		System.out.println("Los vehículos entran en el taller");
		cliente2.llevarAlTaller();
		cliente1.llevarAlTaller();
		System.out.println("Termina de repararse el primer vehículo");
		v1.finalizarReparacion();
		System.out.println("Termina de repararse el segundo vehículo");
		v2.finalizarReparacion();
		System.out.println("Termina de repararse el tercer vehículo");
		v3.finalizarReparacion();		

	}

}
