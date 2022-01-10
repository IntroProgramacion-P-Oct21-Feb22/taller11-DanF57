/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        
        String[] arreglo = funcionArreglo();
        
        funcionConsideracion(arreglo) ;
    }

    public static String[] funcionArreglo() {
        Scanner entrada = new Scanner(System.in);

        int e;

        System.out.println("Ingrese el número de elementos: ");
        e = entrada.nextInt();
        
        entrada.nextLine();
        
        String arreglo[] = new String[e];
        for (int i = 0; i < arreglo.length; i++) {
            int contador = i + 1;
            System.out.printf("Ingrese elemento %d\n", contador);
            arreglo[i] = entrada.nextLine();
        }

        return arreglo;
    }

    public static void funcionConsideracion(String[] elementos) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i].length() == 4 || elementos[i].length() == 5) {
                System.out.println(elementos[i]);
            }
        }
    }

}
