
package ejerciciosarray;

import java.util.Scanner;

/**
 *
 * Crea un Array de longitud que determine el usuario y que le permita insertar
 * numeros entre 0 y 10
 */
public class ArrayLongitudVariable {
    
    public void ceroAdiez(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la lungitud de Array");
        int longitud = s.nextInt();
        int array[]=new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            int valor =(int)Math.floor(Math.random()*(0-(10-1))+(10));
            array[i]=valor;
            System.out.println(array[i]);
        }
}
    
     
    
    
}
