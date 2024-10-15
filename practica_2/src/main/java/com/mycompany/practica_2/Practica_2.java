/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_2;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Practica_2 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        num1=captu.nextInt();
        System.out.println("Introduce el numero 2");
        num2=captu.nextInt();
         
        for(int i =  num1; i<=num2; i++ ){
            
         System.out.print(i + "-");
         
     }
        System.out.println( "");
       for(int i =  num2; i>=num1; i-- ){
         System.out.print(i + "-"); 
         }
    }
}
