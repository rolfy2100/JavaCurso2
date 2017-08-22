package com.gim.vista;

import java.util.Scanner;
import com.gim.controlador.GymControlador;

public final class Test {

	public static void main(String[] args) {
		Test.empezar();
	}
	public static void empezar(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = scanner.nextLine();
		System.out.println("Ingrese su DNI, sin puntos.");
		int dni=0;
		if(scanner.hasNextInt()){
		dni= scanner.nextInt();
		}else{System.out.println("El dato ingresado es incorrecto, vuelva a ingresar sus datos");
		Test.empezar();
		}
		System.out.println("Ingrese su peso, no poner '.' sino ','");
		double peso = 0;
		
		if(scanner.hasNextDouble()){
			peso = scanner.nextDouble();
		}else{
			System.out.println("El dato ingresado es incorrecto, vuelva a ingresar sus datos");
			Test.empezar();
		}
		GymControlador sistema = new GymControlador();
		sistema.gimnasio(nombre, apellido, dni, peso);
	}

}
