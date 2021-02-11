/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

/**
 *
 * @author alvar
 */
public class Array1A100 {
    int numeros[]=new int[100];
    
    public void llenarYmostrar(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i+1;
            System.out.println(numeros[i]);
        }
    }
}
