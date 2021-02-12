/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosarray;

/**
 *
 * Con el array creado anteriormente calcula la suma y la media de todos sus valores
 */
public class SumaYMedia {
  
   
 //========================================================================
 //METODO PARA CALCULAR LA SUMA DE TODOS LOS VALORES INGRESADOS EN EL ARRAY
 //========================================================================
 public void  suma(Array1A100 a){
     int suma=0;
     double media = 0;
     for (int i = 0; i < a.numeros.length; i++) {
         suma+=a.numeros[i];
     }
     System.out.println("La suma de todos los numeros es "+ suma);
     media = suma/a.numeros.length;
        
        System.out.println("La media de todos los numeros es: "+ media);
 }

        
    
}
