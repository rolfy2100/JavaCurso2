package cursoYoutube;

import java.util.*;

public class Pruebas {
	
	public static void pruebaScanner(){
	
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
	
		String nombre_usuario=entrada.nextLine();
	
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();
	
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");
	}
	
	public static void pruebaJOptionPane(){
		
		
	}
}
