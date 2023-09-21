package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa un número: ");

        
        int numeroIngresado = sc.nextInt();

        
        

        
        System.out.println("El número ingresado es: " + numeroIngresado);
        sc.close();
    }
}
