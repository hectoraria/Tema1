package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa la primera nota: ");
        int nota1 = sc.nextInt();

        
        System.out.print("Por favor, ingresa la segunda nota: ");
        int nota2 = sc.nextInt();

        
        float media = (float) (nota1 + nota2) / 2;


        
        System.out.println("La media aritmética de las dos notas es: " + media);
        sc.close();
    }
}