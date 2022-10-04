/*
 * 
 * 
 * 
 */
package textArray;

/**
 *
 * @author Alumno Mañana
 */
public class Array_1 {
        
    public static void main(String[] args) {
            //declarar mi array numero de 3 elementos de tipo entero
            int numero[] = new int [3];
            //imprimir por pantalla el aray
            System.out.println("numeros = "+numero);
            
            numero[0]=10;
            numero[1]=2;
            numero[2]=5;
            
            for (int i = 0; i < numero.length; i++) {
                System.out.println(" El numeros"+i+" = "+numero[i]);
        }
        }
}
