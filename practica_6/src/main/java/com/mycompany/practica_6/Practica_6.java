/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_6;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Practica_6 {

    public static void main(String[] args) {
       int num , l;
        String acum="";
        Scanner captu = new Scanner(System.in);
        System.out.println("NUMERO DESEADO");
        num=captu.nextInt();
        for(int i = 1; i<=num; i++){
            acum=acum+"*";
            System.out.println(acum);
        }
        for(int i = num; i>= 1; i--){
            
            for(l = 1; 1<=i; l++){
            System.out.print("*");
            }
            System.out.println();
            }
       
        
    }
    
    
}
