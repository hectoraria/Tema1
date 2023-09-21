package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        
        double longitud = 2 * Math.PI * radio;

        
        double area = Math.PI * Math.pow(radio, 2);

        

        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
        
        sc.close();
    }
}