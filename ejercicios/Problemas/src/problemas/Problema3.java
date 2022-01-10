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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String mensajecuali;
        System.out.println("Ingrese el primer valor");
        double a = entrada.nextDouble();
        System.out.println("Ingrese el segundo valor");
        double b = entrada.nextDouble();
        System.out.println("Ingrese el tercer valor");
        double c = entrada.nextDouble();
        System.out.println("Ingrese el cuarto valor");
        double d = entrada.nextDouble();

        mensajecuali = obtenerCualitativos(a, b, c, d);
        System.out.println(mensajecuali);
    }

    public static String obtenerCualitativos(double a, double b, double c, double d) {
        String m = "";
        String cadena;

        double suma = a + b + c + d;
        double promedio = suma / 4;

        if (promedio >= 0 && promedio < 5) {
            m = "Regular";
        } else {
            if (promedio >= 5 && promedio < 8) {
                m = "Bueno";
            } else {
                if (promedio >= 8 && promedio < 9) {
                    m = "Muy Bueno";
                } else {
                    if (promedio >= 9 && promedio <= 10) {
                        m = "Sobresaliente";
                    }
                }
            }
        }
        cadena = String.format("El promedio de las notas %.0f, %.0f, %.0f, %.0f "
                + "es %s", 
                a, 
                b, 
                c, 
                d, 
                m);
        return cadena;
    }

}
