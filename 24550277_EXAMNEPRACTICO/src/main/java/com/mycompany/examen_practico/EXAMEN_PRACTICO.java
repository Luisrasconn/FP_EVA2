/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EXAMEN_PRACTICO {

    public static void main(String[] args) {
      int piedra,papel,tijera,eleccion;
      eleccion=1;
      eleccion=2;
      eleccion=3;
      String capturar;
      
        Scanner captu = new Scanner(System.in);
        System.out.println("ELIGE LA OPCION CON LA QUIERAS JUGAR");
       capturar=captu.nextLine();
               
        while(eleccion>=0){
            System.out.println("INTRODUCE EL NUMERO QUE QUIERAS DEL 1-3");
          }  
       if(eleccion==1){
           System.out.println("TU ELEGISTE LA PIEDRA") ;
        }
        if(eleccion==2){
           System.out.println("TU ELEGISTE PAPEL");
      }
        if(eleccion==3){
           System.out.println("TU ELEGISTE TIJERA");
      }
        System.out.println("LA COMPUTADORA ELIGIO");    // EL NOMBRE DE LA PRACTICA TINE QUE SER EL NUMERO DE CONTROL_EXAMEN PRACTICO
    }
}
