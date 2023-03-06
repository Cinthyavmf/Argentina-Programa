package paquete1;

//Declaro la clase principal de mi proyecto
public class ClaseVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hola mundo, estoy aprendiendo JAVA");
		System.out.println((17 > 4) && (4 != 4));*/
		
		//GUÍA DE EJERCICIOS CLASE 1
		//1a:
		System.out.println("EJERCICIO 1a. ");
		int numA = 5;
		int numB = 14;
		while (numA < numB + 1) {
			System.out.print(numA + ", ");
			numA++;
		}
		
		//1b:
		System.out.println("");
		System.out.println("EJERCICIO 1b. ");
		int numC = 5;
		int numD = 14;
		while (numC < numD + 1) {
			if(numC%2 == 0) {
				System.out.print(numC + ", ");
				numC = numC + 2;
			}
			else {
				numC++;
				System.out.print(numC + ", ");
				numC = numC + 2;
			}
		}
		
		//1c y d:
		System.out.println("");
		System.out.println("EJERCICIO 1.c y d:");
		boolean pares = false;
		int numE = 5;
		int numF = 14;
		System.out.println("El resultado del while es:");
		while (numF >=  numE) {
			if (pares == true) {
			
				if (numF %2 == 0) {
			
					System.out.print(numF + ", ");
				}   
			}else {
				if (numF %2 != 0) {
					
					System.out.print(numF + ", ");
				}
			}	

			numF--;
	     	
		}
		
		System.out.println("");
		System.out.println("--------------------------------");
		
		//2.d:

		float ingresos = 29900;
		int cantidadDeVehiculos = 2;
		int cantidadDeInmuebles = 4;
		boolean poseeOtrosBienes = false;
		/*-*/
		if ( (ingresos <= 572386.5) &&
		( cantidadDeVehiculos < 3) &&
		(cantidadDeInmuebles < 3) && 
		(!poseeOtrosBienes)) {
		System.out.println("No pertenece al segmento de ingresos altos");
		} else {
		System.out.println("Pertenece al segmento de ingresos altos");
		}

	}

}
