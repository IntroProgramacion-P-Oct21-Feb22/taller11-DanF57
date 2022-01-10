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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int tipo;
        
        System.out.println("Ingrese 1 para calcular el valor "
                + "de la planilla de luz.\nIngrese 2 para "
                + "calcular el predio de un bien inmueble.");
        tipo = entrada.nextInt();

        if (tipo == 1) {
            planilla_luz();
        } else {
            if (tipo == 2) {
                predio_inmueble();
            } else {
                System.out.println("valor incorrecto");
            }
        }
    }

    public static void planilla_luz() {
        Scanner ingreso = new Scanner(System.in);
        
        String nombre;
        String cedula;
        double valor_kilo;
        double numero_kilo;
        double precio;
        
        System.out.println("Ingrese nombre y apellido del cliente");
        nombre = ingreso.nextLine();
        System.out.println("Ingrese número de cédula del cliente");
        cedula = ingreso.nextLine();
        System.out.println("Ingrese el valor por kilovatio");
        valor_kilo = ingreso.nextDouble();
        System.out.println("Ingrese la cantidad de kilovatios");
        numero_kilo = ingreso.nextDouble();
        
        precio = valor_kilo * numero_kilo;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de "
                + "$%.2f\n", nombre, cedula, precio);
    }

    public static void predio_inmueble() {
        Scanner ingreso = new Scanner(System.in);
        
        String nombre;
        String cedula;
        double valorin;
        double predio;
        
        System.out.println("Ingrese nombre y apellido del cliente");
        nombre = ingreso.nextLine();
        System.out.println("Ingrese número de cédula del cliente");
        cedula = ingreso.nextLine();
        System.out.println("Ingrese el valor del inmueble");
        valorin = ingreso.nextDouble();
        
        predio = valorin * 0.02;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en %.2f y tiene que pagar de predio $%.2f\n", 
                nombre, 
                cedula, 
                valorin, 
                predio);
    }

}
