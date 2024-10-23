/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
       int cantidad;
       int califas[];
       String nombres[];
        Scanner captu = new Scanner(System.in);
        System.out.println("CUANTAS CALIFICIONES SON");
        cantidad=captu.nextInt();
        captu.nextLine();
        califas= new int [cantidad];
        nombres = new String[cantidad];
        
        for (int i = 0; i < califas.length; i++) {
             System.out.println("NOMBRE ESTUDIANTE #"+ i);
            nombres[i]= captu.nextLine();
           
            System.out.println("CALIFICACION ESTUDIANTE #"+ i);
            califas[i]= captu.nextInt();
            captu.nextLine();
        }
         for (int i = 0; i < califas.length; i++) {
            System.out.print(nombres[i] + ":" +califas[i] +  "-");
            
            
        }

    }
}
