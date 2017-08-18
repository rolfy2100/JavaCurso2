package edu.utn.modelo;

public final class Pasajero {
	public double dinero;
	public String nombre;

	
	public  void subir(double dineroPasajero){
		dinero = dineroPasajero;
		

		System.out.println("cobrame 'uachin ");		
	}
	
	
	public static void bajar(){
		
		System.out.println("Parada chofeeeeeeeeeer!");
		
		
	}
	public static void mostrarDinero(double dinero){
		
		
		System.out.println("La cantidad de dinero disponible es " + dinero);
		System.out.println("===============================================");
		
	}

}
