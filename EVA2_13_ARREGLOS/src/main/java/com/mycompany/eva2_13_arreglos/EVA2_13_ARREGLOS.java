/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_arreglos;

/**
 *
 * @author fdo_g
 */
public class EVA2_13_ARREGLOS {

    public static void main(String[] args) {
        //int[]--> indica que es un arreglo de enteros
        //new int[10];--->crea el arreglo con 10 espacios para enteros
        int[] arreglo = new int[10];
        arreglo[0]=100;//ponemos 100 en el entero en la posicion 0
        arreglo[9]=900;// ultima posicion (10-1)si te quivocas en las posiciones el programa falla
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        System.out.println(arreglo[6]);
        System.out.println(arreglo[7]);
        System.out.println(arreglo[8]);
        System.out.println(arreglo[9]);
    }
}
