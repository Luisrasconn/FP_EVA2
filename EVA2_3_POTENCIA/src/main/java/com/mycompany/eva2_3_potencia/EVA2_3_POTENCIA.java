/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int base,exp ;
        Scanner captu = new Scanner(System.in);
        System.out.println("DAME LA BASE");
        base=captu.nextInt();
        captu.nextLine();
        System.out.println("DAME EL EXPONENTE");
        exp=captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i<=exp; i++){
         resu=resu*base;   
        }
        System.out.println("EL RESULTADO ES= "   +  resu);
    }
}
