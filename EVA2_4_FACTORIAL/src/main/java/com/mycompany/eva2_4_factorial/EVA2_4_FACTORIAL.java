/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
          
          double num, resul=1 ;
        Scanner captu = new Scanner(System.in);
        System.out.println("DAME EL NUMERO");
        num=captu.nextInt();
        captu.nextLine();
        for(int i = 1; i<=num; i++){
            resul= resul*i;
          
        }
        System.out.println("EL RESULTADO ES= " +  resul);
    }
}
