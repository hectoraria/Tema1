package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String Nombre = sc.nextLine();
		System.out.println("Escribe tu dirección: ");
		String Dirección = sc.nextLine();
		System.out.println("Escribe tu numero de telefono: ");
		int Telefono = sc.nextInt();
		
		System.out.println("Nombre: "+Nombre);
		System.out.println("Dirección: "+Dirección);
		System.out.println("Telefono: "+Telefono);
		
		
		
		 sc.close();
	}

}
