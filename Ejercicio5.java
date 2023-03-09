/*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número
*/
package com.mycompany.dia2;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        
        System.out.println("Digite un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println(num1+" al cuadrado = " + Math.pow(num1, 2));
        System.out.println(num1+" al cubo = " + Math.pow(num1, 3));
        System.out.println(num1+" La raiz cuadrada es = " + Math.sqrt(num1));
        
    }
}
