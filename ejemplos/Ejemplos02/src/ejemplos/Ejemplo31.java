/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //

        String[] arreglo = new String[5];

        presentarDiagonal(arreglo);
    }

    public static void presentarDiagonal(String[] arreglo) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el dato número %d\n", i);
            arreglo[i] = entrada.nextLine();
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%s\n", arreglo[i]);
        }
    }
}
