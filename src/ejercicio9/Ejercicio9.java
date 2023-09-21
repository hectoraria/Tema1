package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de euros: ");
		Double Euros = sc.nextDouble();
		Double Pesetas = sc.nextDouble();
		
		Pesetas = Euros * 166 ; 
		
		System.out.println("La cantidad de pesetas es: "+Pesetas);
		
		
		
		
		 sc.close();
	}

}
