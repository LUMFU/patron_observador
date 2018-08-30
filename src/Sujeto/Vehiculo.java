package Sujeto;

import Observador.*;

public interface Vehiculo {

	boolean agregarObservador(ClienteConcreto observador);
	
	void eliminarObservador(ClienteConcreto observador);
	
	void notificar();
	
	void entregarVehiculo();
	
	void finalizarReparacion();
	
	void recogerVehiculo();

}
