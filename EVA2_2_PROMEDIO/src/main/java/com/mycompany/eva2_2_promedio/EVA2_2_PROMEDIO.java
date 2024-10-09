/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        int califa,sumacal;
        double prom;
        Scanner captu = new Scanner(System.in);
        //inicializar el acumulador
        sumacal= 0;
        prom=sumacal /10;
        for(int i = 1; i<= 10; i++){
             System.out.println("ESTUDIANTE # "+ i);
            System.out.println("CUAL ES TU CALIFICACION");
        califa=captu.nextInt();
        captu.nextLine();
         //acumular las calificaciones 
         sumacal= sumacal + califa;
         prom= sumacal /10.0;
         
        }
        
        System.out.println("sumacal="+ sumacal );
        System.out.println("promedio="+ prom );
        
        
        
        
        
    }
}
