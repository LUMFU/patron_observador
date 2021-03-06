package Principal;

import Observador.*;
import Sujeto.*;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new VehiculoConcreto("Primer vehÝculo");
		Vehiculo v2 = new VehiculoConcreto("Segundo vehÝculo");
		Vehiculo v3 = new VehiculoConcreto("Tercer vehÝculo");
		ClienteConcreto cliente1 = new ClienteConcreto("Propietario 1");
		ClienteConcreto cliente2 = new ClienteConcreto("Propietario 2");
		
		System.out.println("Se le asigna a Propietario 1 el primer vehÝculo");
		cliente1.agregarVehiculo(v1);
		System.out.println("Se le intenta asignar a Propietario 2 el mismo vehÝculo");
		cliente2.agregarVehiculo(v1);
		System.out.println("Se le asignan a Propietario 2 los otros dos vehÝculos");
		cliente2.agregarVehiculo(v3);
		cliente2.agregarVehiculo(v2);
		
		System.out.println("Los vehÝculos entran en el taller");
		cliente2.llevarAlTaller();
		cliente1.llevarAlTaller();
		System.out.println("Termina de repararse el primer vehÝculo");
		v1.finalizarReparacion();
		System.out.println("Termina de repararse el segundo vehÝculo");
		v2.finalizarReparacion();
		System.out.println("Termina de repararse el tercer vehÝculo");
		v3.finalizarReparacion();		

	}

}
