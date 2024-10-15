/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_4;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Practica_4 {

    public static void main(String[] args) {
        String cade;
        String acum;
        Scanner captu = new Scanner(System.in);
        System.out.println("INGRESE SU CADENA");
        cade=captu.nextLine();
        for(int i = 0; i<cade.length(); i++ ){
             char vocal=cade.charAt(i);
             if(vocal=='a'|| vocal=='e'|| vocal=='i'|| vocal=='o'|| vocal=='u' ){
                 System.out.println(vocal + "");  
             }
        }
    }
}
