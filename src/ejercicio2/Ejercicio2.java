package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa tu edad: ");

        
        int edadActual = sc.nextInt();

        
        int edadProximoAño = edadActual + 1;

        
        

        
        System.out.println("Tu edad el próximo año será: " + edadProximoAño);
        sc.close();
    }
}