package edu.utn.modelo;

public final class Colectivo {

	int linea;
	static String pasajeros[] = new String[500];
	static int cantmax=3;
	static int asientos=10;
	static double precio = 5;
	static boolean lleno=false;
	static int pasajerosViajando=0;

	public static void cobrar(Pasajero pasajero){
	
		int i = 0;
		
		pasajeros[i]=pasajero.nombre;
		i++;
		
		pasajerosViajando++;
		
		Colectivo.stockEspacio(pasajerosViajando);
		
		pasajero.dinero=pasajero.dinero-precio;
		System.out.println("Al pasajero: " + pasajero.nombre + " le queda " + pasajero.dinero );
				
		
		
	}


	public static void stockEspacio(int cantPasajeros) {
		
		if(cantPasajeros == cantmax) 
		{
			lleno=true;
			System.err.println("estan como ganado");
		}
		
	}
}
