/*
Generar un procedimiento (método que no devuelva valor) 
que imprima los valor pares de un arreglo bidimensional.
El procedimiento o método debe se invocado desde el método main (principal); 
además el método debe recibir como parámetro un arreglo bidimensional.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }
    
    public static void imprimirDatos(int[][] datos){
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.printf("%d ",datos[i][j]);
            }
            
        }
    }
    
}
