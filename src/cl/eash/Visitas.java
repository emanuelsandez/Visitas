/*
 * Proyecto que permite el cálculo de un promedio de visitas 
 * de una pagina web segun la cantidad de dias que ingrese el usuario
 */
package cl.eash;

import java.util.Scanner;
import java.util.ArrayList;

public class Visitas {
	static int dias;
	/*
	 * Declaracion de una variable de clase que permite utilizarse tanto en el
	 * método principal como en el método de cálculo de promedio
	 */

	public static void main(String[] args) {
		ArrayList<Integer> visitasPag = new ArrayList<Integer>();
		// declaración de arreglo que permitira almacenar los valores de visitas de la
		// pagina web

		Scanner sc = new Scanner(System.in);
		// Declaracion de variable scanner
		System.out.println("Ingrese la cantidad de días en cual se midieron las visitas a la página");
		dias = sc.nextInt();
		for (int i = 0; i < dias; i++) {
			// Ciclo for que permite el almacenamiento de los datos en el arreglo creado
			System.out.println("Ingrese la cantidad de visitas del día " + (i + 1));
			visitasPag.add(sc.nextInt());
		}
		promedio(visitasPag);
		// Metodo que permite el calculo de promedio de visitas de la pagina web
		sc.close();
	}

	static void promedio(ArrayList<Integer> visitasPag) {
		int suma = 0;
		// Declaracion de acumulador de visitas
		for (Integer e : visitasPag) {
			suma = suma + e;
			System.out.println(suma);
		}
		float promedio = suma / dias;
		// Declaracion de variable que permite el calculo del promedio de visitas
		System.out.printf("El promedio de visitas es %.1f", promedio);

	}
}
