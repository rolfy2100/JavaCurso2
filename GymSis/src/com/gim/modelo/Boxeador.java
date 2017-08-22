package com.gim.modelo;

public class Boxeador {

	public String nombre;
	public String apellido;
	public int dni;
	public double peso;
	public String categoria;
	public String entrenador;

	public void entrenar(){
		
		System.out.println(this.nombre + ": ya mismo me pongo a hacer ejercicio.");
	}

	public void dieta() {

		System.out.println(this.nombre + ": estoy engordando.");
	}
	
	
}
