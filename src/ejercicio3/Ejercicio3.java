package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa el año actual: ");
        int añoActual = sc.nextInt();

        
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int añoNacimiento = sc.nextInt();

        
        int edad = añoActual - añoNacimiento;
        
        System.out.println("Tu edad es: " + edad + " años");
        sc.close();
    }
}