package Principal;

import Observador.*;
import Sujeto.*;

public class Main {

	public static void main(String[] args) {
		Vehiculo v1 = new VehiculoConcreto("Primer veh�culo");
		Vehiculo v2 = new VehiculoConcreto("Segundo veh�culo");
		Vehiculo v3 = new VehiculoConcreto("Tercer veh�culo");
		ClienteConcreto cliente1 = new ClienteConcreto("Propietario 1");
		ClienteConcreto cliente2 = new ClienteConcreto("Propietario 2");
		
		System.out.println("Se le asigna a Propietario 1 el primer veh�culo");
		cliente1.agregarVehiculo(v1);
		System.out.println("Se le intenta asignar a Propietario 2 el mismo veh�culo");
		cliente2.agregarVehiculo(v1);
		System.out.println("Se le asignan a Propietario 2 los otros dos veh�culos");
		cliente2.agregarVehiculo(v3);
		cliente2.agregarVehiculo(v2);
		
		System.out.println("Los veh�culos entran en el taller");
		cliente2.llevarAlTaller();
		cliente1.llevarAlTaller();
		System.out.println("Termina de repararse el primer veh�culo");
		v1.finalizarReparacion();
		System.out.println("Termina de repararse el segundo veh�culo");
		v2.finalizarReparacion();
		System.out.println("Termina de repararse el tercer veh�culo");
		v3.finalizarReparacion();		

	}

}
