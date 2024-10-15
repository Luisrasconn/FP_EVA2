/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_3;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Practica_3 {

    public static void main(String[] args) {
       String cade;
        Scanner captu = new Scanner(System.in);
        System.out.println("INGRESE SU CADENA");
        cade=captu.nextLine();
       
         for(int i = 0; i<cade.length(); i++ ){
             System.out.println(cade.charAt(i)); 
        }
        
        {
            
        }
    }
}
