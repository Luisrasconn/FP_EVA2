/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1ciclos;

/**
 *
 * @author fdo_g
 */
public class EVA2_1CICLOS {

    public static void main(String[] args) {
        //REPETICION DE INSTRUCCIONES:
        //CICLOS O BUCLES 
        //FOR(DESDE): CUANDO SABEN EXACTAMENTE LA CANTIDAD DE INSTRUCCIONES QUE SE VAN A USAR
                        // ES UN CONTADOR 3 parametros: punto indicio,condicion,
        //WHILE(MIENTRAS)CUANDO SE REPITE CERO O N VECES
        //DO WHILE(HACER MIENTRAS).CUANDO SE REPITE AL MENOS 1 VEZ HASTA N VECES
                       // SON CONDICIONES
        //i--->  indice
     //CICLO FOR
     //++ --> operador paara sumar 1
     //-- --> resta una unjda
     //+= suma n valor
     //-= resta n valor
     // *= multiplica por n
   
     for(int i =  1; i<=10; i++ ){// la variable i solo existe dentro de cada llave
         System.out.print(i + "-");
         
     }
        System.out.println( "");
       for(int i =  10; i>=1; i-- ){
         System.out.print(i + "-");  
       }  
    }
}
