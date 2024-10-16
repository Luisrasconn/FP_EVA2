/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while;

/**
 *
 * @author fdo_g
 */
public class EVA2_7_WHILE {

    public static void main(String[] args) {
        //WHILE---> CUANDO SE PUEDE REPETIR 0 O MAS VECES
        //IMPRIMIR LOS NUMEROS DEL 1-10
        int val=1;
        while(val <= 10){ //WHILE-->MIENTRAS(ESTO SEA VERDAD){REPITO ESTO
            System.out.print(val + "-");
            val++;
            }
        System.out.println("");
       val=1;
       do{
            System.out.print(val + "-");
            val++;
       }while(val <= 10);//REPETIR LAS INSTRUCCIONES{mientras esto se cumpla
    }
     
}
