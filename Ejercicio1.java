/*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
*/
package com.mycompany.dia2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado;
        
        System.out.print("Digite el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = entrada.nextInt();
        
        resultado = num1 + num2;
        
        System.out.print("La suma del numero "+num1+" y "+num2+" es: "+resultado);
        
        
    }
}
