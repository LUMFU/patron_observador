package Sujeto;

import Observador.*;

public class VehiculoConcreto implements Vehiculo {

	// Un veh�culo tiene un solo propietario por lo tanto solo se notificar� a un observador
	private ClienteConcreto observador; 
	private String estado;
	private String nombre;
	
	public VehiculoConcreto(String nombre) {
		this.nombre = nombre;
		estado = "Recogido";
	}

	@Override
	public boolean agregarObservador(ClienteConcreto observador) {
		if (this.observador != null) {
			System.out.println("El veh�culo ya tiene un propietario: " + this.observador.getNombre());
			return false;
		} else {
			this.observador = observador;
			System.out.println("El propietario del veh�culo " + nombre + " es " + observador.getNombre());
			return true;
		}
	}

	@Override
	public void eliminarObservador(ClienteConcreto observador) {
		if (observador.equals(this.observador)) {
			this.observador = null;
		} else {
			System.out.println("No es observador de este veh�culo.");
		}
	}

	@Override
	public void notificar() {
		if (observador != null) {
			observador.actualizar(this);
		}
	}
	
	public void entregarVehiculo() {
		if ("Recogido".equals(estado)) {
			estado = "En reparacion";
			System.out.println("El veh�culo " + nombre + " ha entrado en el taller.");
		} else {
			System.out.println("El veh�culo " + nombre + " ya est� en el taller");
		}
	}
	
	public void finalizarReparacion() {
		if ("En reparacion".equals(estado)) {
			estado = "Finalizado";
			System.out.println("Se ha finalizado la reparaci�n del " + nombre + 
					" y se va a notificar al propietario");
			notificar();
		} else {
			System.out.println("Error: el veh�culo " + nombre + " no estaba siendo reparado");
		}
	}
	
	public void recogerVehiculo() {
		if ("Finalizado".equals(estado)) {
			estado = "Recogido";
			System.out.println("El veh�culo " + nombre + " ha sido recogido.");
		} else {
			System.out.println("Error: el veh�culo " + nombre + " no est� reparado en el taller");
		}
	}

}
