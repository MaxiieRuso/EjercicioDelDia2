/*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
package com.mycompany.dia2;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float gradosC, fahr;
        
        System.out.println("Digite los grados centigrados ");
        gradosC = entrada.nextFloat();

        fahr = 32 + (9 * gradosC / 5);
        System.out.println("El equivalente en grados Fahrenheit es de: " + fahr );
        
    }
}
