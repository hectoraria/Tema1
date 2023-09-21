package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, ingresa el primer número: ");
        double numero1 = sc.nextDouble();

        
        System.out.print("Por favor, ingresa el segundo número: ");
        double numero2 = sc.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        // Utilizo una condicional para que si el número es 0 no se divida
        
        if (numero2 != 0) {

            System.out.println("División: " + division);
            
        } else {

            System.out.println("División: No es posible dividir por cero.");
        }

        
        sc.close();
    }
}