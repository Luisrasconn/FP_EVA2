/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_1;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Practica_1 {

    public static void main(String[] args) {
        int num;
        String cadena;
       Scanner captu = new Scanner(System.in);
       System.out.println("DAME LA CADENA DE TEXTO");
        cadena=captu.nextLine();
        System.out.println("DAME EL NUMERO DE VECES QUE QUIERRS IMPRIMIRLO");
        num=captu.nextInt();
        captu.nextLine();
        for(int i = 1; i<=num; i++){
            
            System.out.println(cadena);
            }
    }
}
