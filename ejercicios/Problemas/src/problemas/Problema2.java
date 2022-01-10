/*

 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operacion;

        System.out.println("Ingrese 1 para Cuadrado. Ingrese 2 para Rectángulo."
                + " Ingrese 3 para Triángulo.");
        int tipo = entrada.nextInt();

        if (tipo == 1) {
            area_Cuadrado();
        } else {
            if (tipo == 2) {
                area_Triangulo();
            } else {
                if (tipo == 3) {
                    area_Rectangulo();
                } else {
                    System.out.println("valor incorrecto");
                }
            }
        }

    }

    public static void area_Cuadrado() {
        Scanner entradame = new Scanner(System.in);
        double lado;
        double operacion;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entradame.nextDouble();
        operacion = lado * lado;
        System.out.printf("%.2f", operacion);
    }

    public static void area_Triangulo() {
        Scanner entradame = new Scanner(System.in);
        double base;
        double altura;
        double operacion;
        System.out.println("Ingrese la base del triángulo");
        base = entradame.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
        altura = entradame.nextDouble();
        operacion = (base * altura) / 2;
        System.out.printf("%.2f", operacion);
    }

    public static void area_Rectangulo() {
        Scanner entradame = new Scanner(System.in);
        double base;
        double altura;
        double operacion;
        System.out.println("Ingrese la base del rectángulo");
        base = entradame.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        altura = entradame.nextDouble();
        operacion = (base * altura);
        System.out.printf("%.2f", operacion);
    }
}
