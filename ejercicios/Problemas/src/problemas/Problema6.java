/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        double aritmetica;
        double desviacion; 
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        
        aritmetica = media(informacion);
        System.out.printf("Media aritmética: %.2f\n", aritmetica); 
        desviacion = desviacionEstandar(informacion, aritmetica) ;
        System.out.printf("Desviación estándar: %.4f\n", desviacion);
    }
    
    public static double media(int[] info){
        int suma = 0;
        int contador = 0;
        double media;
        for (int i = 0; i < info.length; i++){
            suma = suma + info[i];
            contador = contador + 1;
        }
        media = suma/contador;
        
        return media;
    }
    
    public static double desviacionEstandar(int[] info, double media){
        double S;
        double rango;
        double varianza = 0;
        int suma = 0;
        
        for (int i = 0; i < info.length; i++){
            suma = suma + info[i];
        }
        
        for (int i = 0; i < info.length; i++ ){
            rango = Math.pow(info[i] - media, 2);
            varianza = varianza + rango;
        }
        varianza = varianza / info.length ;
        S = Math.sqrt(varianza);
        
        return S;
    }
    
}
