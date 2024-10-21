/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num,acum=0;
        Scanner captu = new Scanner(System.in);
       while(true){
        System.out.println("INTRODUZCA UN NUMERO ");
        num=captu.nextInt();
        if(num>acum){
        acum=num;
        }
        if(num<0){
            break;
            
        }
        
        }
        System.out.println("SU NUMERO MAS GRANDE ES " + acum);
      
    }
}
