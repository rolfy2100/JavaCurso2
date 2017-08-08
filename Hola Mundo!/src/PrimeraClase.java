import java.util.*;

import cursoYoutube.Pruebas;
import ejerciciosCurso.Ejercicios;
public class PrimeraClase {

	public static void main (String args[]){
		
		Ejercicios.ejercicio7();
		Scanner entrada = new Scanner(System.in);
		int N;
		double A;
		char C;
		N=5;
		A=4;
		C='b';
		
		System.out.println(N);
		System.out.println(A);
		System.out.println(C);
		
		System.out.println(N + A);
		System.out.println(A - N);
		System.out.println("La variable C que es igual a " + C + " tiene el valor numerico correspondiente a 65");
		
		int c=5;
		
		final double apulgadas=2.54;

		double cm = 6;
		
		double resultado = cm/apulgadas;

		String en = "1";
		
		boolean fuma = true;
		
		System.out.println("EN" + cm + en + resultado + " pulgadas");

		
		c=7;
		
		System.out.println("Hola Mundo!" + c);
		
		int num;
		
		num=5;
		
		num-=5;
		
		System.out.println(num);
		
		double raiz=Math.sqrt(4);
		
		int b = (int)raiz;
		
		double potencia = Math.pow(b, raiz);
		
		Math.round(potencia);
		
		final double pi= Math.PI;
		
		System.out.println((int)b + (int)potencia);
		//Clase math para realizar operaciones matematicas
		//clases predefinidas en java
		//string, math, array, thread
		//cada clase viene con sus metodos
		//son tantos que son imposibles de recordar
		//api java= biblioteca de clases de java
		
		int raiz1=(int)Math.sqrt(4);
		System.out.println(raiz1);
		//que es castear???
		//
		long redondeo =Math.round(4.2);
		System.out.println(redondeo);
	}
	
	public static void probandoScanner(){
		
		
	}
		
}