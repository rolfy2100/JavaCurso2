package ejerciciosCurso;

public class Ejercicios {
	public static void ejercicios(){
	
	int n;//declaro variable del tipo int
	double a;//declaro variable del tipo double
	char c;//declaro variable del tipo char
	n=1;//asigno valor a la variable n
	a=2.3;//asigno valor a la variable a
	c='c';//asigno valor a la variable c
	
	int valorCaracter=(int)c;//asigno a una variable del tipo int el valor numerico de la variable c
	
	System.out.println("Este es el valor de la variable n: "
			+ n + ". Este es el valor de la variable a: " + a + 
			". Este es el valor de la variable c: " + c);
	
	System.out.println("La suma de n + a es igual a: " + (n+a));
	
	System.out.println("La diferencia entre a - n es igual a: " + (a-n));
	
	System.out.println("El valor numerico del caracter c es igual a: " + valorCaracter);
	}
	
	public static void ejercicios2(){
	
		int x, y; 
		double n, m;
		x=5;
		y=6;
		n=7.5;
		m=8.4;
	
		System.out.println("La suma entre x e y es: " + (x+y));
		System.out.println("El resultado de la multiplicacion entre x, y, n y m es igual a: " + (x*y*n*m));
		System.out.println("El resultado de elevar a x a la potencia y es igual a: " + Math.pow(x,y));

	}
	
	public static void ejercicios3(){

		int n;
		n=20;
		n=n+77;
		n=n-3;
		n=n*2;
		
		System.out.println("El valor de n es: " + n);
	}
	public static void ejercicios4(){
		
		int a, b, c, d;
		a=2;
		b=3;
		c=4;
		d=5;
	
		
		b=c;
		c=a;
		a=d;
		d=b;
		
		//segunda forma de hacerlo
		//int aux=b;
		//b=c;
		//c=a;
		//a=d;
		//d=aux;
	
	}
	public static void ejercicios5(){
		
		int a=-12;
		String par, impar;
		par= "par";
		impar="impar";
		System.out.println("El numero ingresado es " + ((a%2==0)?par:impar));
	}
	
	public static void ejercicios6(){
		
		int b=0;
		String positivo ="positivo";
		String negativo="negativo";
		System.out.println("La variable b es " + ((1*b>=0)?positivo:negativo));
	}
	
	public static void ejercicio7(){
		
		int c=101;
		String positivo ="positivo";
		String negativo="negativo";
		System.out.println("La variable c es " + ((1*c>=0)?positivo:negativo));
		
		String par, impar;
		par= "par";
		impar="impar";
		System.out.println("El numero ingresado es " + ((c%2==0)?par:impar));

		String multiplo= "es multiplo de 5";
		String noMultiplo="no es multiplo de 5";
		
		System.out.println("El numero ingresado " + ((c%5==0)?multiplo:noMultiplo));
	
		String multiploDiez= "es multiplo de 10";
		String noMultiploDiez="no es multiplo de 10";
		
		System.out.println("El numero ingresado " + ((c%10==0)?multiploDiez:noMultiploDiez));
		
		String mayor = "es mayor que 100";
		String menor= "no es mayor que 100";
		System.out.println("El numero ingresado " + ((c<=100)?menor:mayor));
	}
}
