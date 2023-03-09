/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla
*/
package com.mycompany.dia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.println("Digite su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Hola "+nombre+ " gusto en conocerte!! :D ");
    }
}
