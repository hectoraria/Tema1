package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String Nombre = sc.nextLine();
		System.out.println("Escribe tu edad: ");
		int Edad = sc.nextInt();
		
		System.out.println("Hola "+Nombre+", tienes "+Edad+", ¡qué mayor eres!");
		
		
		
		
		 sc.close();
	}

}