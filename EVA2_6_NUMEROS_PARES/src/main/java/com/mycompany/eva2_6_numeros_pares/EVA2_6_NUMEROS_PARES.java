/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_6_NUMEROS_PARES {

    public static void main(String[] args) {
       int num1,num2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        num1=captu.nextInt();
        System.out.println("Introduce el numero 2");
        num2=captu.nextInt();
        captu.nextLine();
        
        for(int i=num1; i<=num2; i++){
            int modulo=i % 2;
            if(modulo ==0)
                continue;
            System.out.print(i + " - ");
        }
    }
}
