package com.gim.modelo;

public class Sistema {

	public static int cantbox=0;
	public static Entrenador entrenadores[];
	public static int mosGal=0;
	public static int pluLig=0;
	public static int welMed=0;
	public static int medPes=0;


	public Boxeador fichado(Aspirante aspi){
		Boxeador numero1=new Boxeador();
		if(cantbox<20){
			numero1.apellido=aspi.apellido;
			numero1.nombre=aspi.nombre;
			numero1.peso=aspi.peso;
			numero1.dni=aspi.dni;
		

			if(aspi.peso<52.163){
				if(mosGal<5){
					numero1.categoria="Mosca";
					numero1.entrenador=entrenadores[0].nombre;
					entrenadores[0].boxeador[mosGal]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					mosGal++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=52.163&&aspi.peso<55.338){
				if(mosGal<5){
					numero1.categoria="Gallo";
					numero1.entrenador=entrenadores[0].nombre;
					entrenadores[0].boxeador[mosGal]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					mosGal++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=55.338&&aspi.peso<58.967){
				if(pluLig<5){
					numero1.categoria="Pluma";
					numero1.entrenador=entrenadores[1].nombre;
					entrenadores[1].boxeador[0]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					pluLig++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=58.967&&aspi.peso<63.503){
				if(pluLig<5){
					numero1.categoria="Ligero";
					numero1.entrenador=entrenadores[1].nombre;
					entrenadores[1].boxeador[0]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					pluLig++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=63.503&&aspi.peso<69.853){
				if(welMed<5){
					numero1.categoria="Welter";
					numero1.entrenador=entrenadores[2].nombre;
					entrenadores[2].boxeador[0]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					welMed++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=69.853&&aspi.peso<76.205){
				if(welMed<5){
					numero1.categoria="Mediano";
					numero1.entrenador=entrenadores[2].nombre;
					entrenadores[2].boxeador[0]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					welMed++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(aspi.peso>=76.205&&aspi.peso<91){
				if(medPes<5){
					numero1.categoria="Medio pesado";
					numero1.entrenador=entrenadores[3].nombre;
					entrenadores[3].boxeador[0]=numero1;
					System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
					medPes++;
					cantbox++;
				}else{
					System.out.println("El cupo para tu categoria ya esta cubierto");
					numero1=null;
				}
			}else if(medPes<5){
				numero1.categoria="Pesado";
				numero1.entrenador=entrenadores[3].nombre;
				entrenadores[3].boxeador[0]=numero1;
				System.out.println("Bienvenido " + numero1.nombre + "! Fuiste asignado a la categoria " + numero1.categoria + " y vas a tener como entrenador a " + numero1.entrenador + "." );
				medPes++;
				cantbox++;
			}else{
				System.out.println("El cupo para tu categoria ya esta cubierto");
				numero1=null;
			}

			System.out.println(mosGal+"" +""+pluLig+""+ welMed+""+ medPes);
		}else{
			numero1=null;
			System.err.println("El cupo de boxeadores ya fue cubierto.");
		}
		return numero1;
	}
	public void inicializar(){
		entrenadores=new Entrenador[4];
	}

	public void reporte(){

		System.out.println("La cantidad de boxeadores ingresados el dia de hoy fueron " + cantbox + ".");

			System.out.println("El entrenador " + entrenadores[0].nombre + " tiene " + mosGal + ((mosGal>1||mosGal==0)?" boxeadores.":" boxeador."));
			System.out.println("El entrenador " + entrenadores[1].nombre + " tiene " + pluLig + ((pluLig>1||pluLig==0)?" boxeadores.":" boxeador."));
			System.out.println("El entrenador " + entrenadores[2].nombre + " tiene " + welMed + ((welMed>1||welMed==0)?" boxeadores.":" boxeador."));
			System.out.println("El entrenador " + entrenadores[3].nombre + " tiene " + medPes + ((medPes>1||medPes==0)?" boxeadores.":" boxeador."));
	}

}	/*Las categorías serán las 8 típicas del Boxeo:
		Categoría PESO en Kg
		 mínimo Máximo
		Mosca 48.988 50.802
		Gallo 52.163 53.525
		Pluma 55.338 57.152
		Ligero 58.967 61.237
		Welter 63.503 66.678
		Mediano 69.853 72.562
		Mediopesado 76.205 79.378
		Pesado 91 Sin Límite*/ 


