package edu.utn.controlador;

import edu.utn.modelo.Colectivo;
import edu.utn.modelo.Pasajero;

public final class Recorrido {
	
	public static void recorrido (){
		
		Pasajero p1= new Pasajero();
		p1.dinero=50;
		p1.nombre="Javier";
		p1.subir(p1.dinero);
		Colectivo.cobrar(p1);
		Pasajero.mostrarDinero(p1.dinero);
		
		
			
		Pasajero p2= new Pasajero();
		p2.dinero=50;
		p2.nombre="Javier";
		p2.subir(p2.dinero);
		Colectivo.cobrar(p2);
		Pasajero.mostrarDinero(p2.dinero);
		
		Pasajero p3= new Pasajero();
		p3.dinero=50;
		p3.nombre="Javier";
		p3.subir(p3.dinero);
		Colectivo.cobrar(p3);
		Pasajero.mostrarDinero(p3.dinero);
		
		Pasajero p4= new Pasajero();
		p4.dinero=50;
		p4.nombre="Javier";
		p4.subir(p4.dinero);
		Colectivo.cobrar(p4);
		Pasajero.mostrarDinero(p4.dinero);
		
		
	}
}
