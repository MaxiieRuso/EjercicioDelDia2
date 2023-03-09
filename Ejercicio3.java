/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
*/
package com.mycompany.dia2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        
        System.out.println("Escriba una frase: ");
        frase = entrada.nextLine();
        
        System.out.println("La frase en minuscula es: " + frase.toLowerCase());
        System.out.println("La Frase en mayuscula es: " + frase.toUpperCase());
        
    }

}
