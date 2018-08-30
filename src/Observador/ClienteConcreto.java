package Observador;

import java.util.ArrayList;
import java.util.List;

import Sujeto.Vehiculo;

public class ClienteConcreto implements Cliente {

	private List<Vehiculo> vehiculos;
	private String nombre;
	
	public ClienteConcreto(String nombre) {
		this.nombre = nombre;
		vehiculos = new ArrayList<Vehiculo>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		if (vehiculo.agregarObservador(this)) {
			vehiculos.add(vehiculo);
		}
	}
	
	public void eliminarVehiculo(Vehiculo vehiculo) {
		vehiculo.eliminarObservador(this);
		vehiculos.remove(vehiculo);
	}
	
	public void llevarAlTaller(Vehiculo vehiculo) {
		if (vehiculos.contains(vehiculo)) {
			vehiculo.entregarVehiculo();
		}
	}

	public void llevarAlTaller() {
		for (Vehiculo v : vehiculos) {
			v.entregarVehiculo();
		}
	}
	
	public boolean recoger(Vehiculo vehiculo) {
		if (vehiculos.contains(vehiculo)) {
			vehiculo.recogerVehiculo();
			return true;
		}
		return false;
	}

	
	@Override
	public void actualizar(Vehiculo vehiculo) {
		if (!recoger(vehiculo)) {
			System.out.println("El vehículo no pertenece a " + nombre);
		}
	}

}
