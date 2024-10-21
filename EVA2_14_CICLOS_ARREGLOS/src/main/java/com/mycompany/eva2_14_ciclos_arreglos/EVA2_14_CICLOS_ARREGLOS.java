/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author fdo_g
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int dato,valores[];//un solo arreglo-->valores
        int[] datos,x,y,z;//todos son arreglos
        int[]arreglo = new int[100];
        
        for (int i = 0; i < arreglo.length; i++) {//asignar valores
            arreglo[i]=(int)(Math.random() * 100);    
        }
        //System.out.println(arreglo);SOLO IMPRIME LA DIRECCION EN MEMORIA
        
        for (int i = 0; i < arreglo.length; i++) {//leer todos los valores del arreglo
            System.out.print(arreglo[i]+ "-");
            
        }
    }
}
