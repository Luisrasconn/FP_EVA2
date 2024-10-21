/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_8_VALIDAR {

    public static void main(String[] args) {
        int dia;
         Scanner captu=new Scanner(System.in);
         do{
        System.out.println("Numero Correspondiente al dia (1-7):");
        dia=captu.nextInt();
        }while(dia < 1 || dia>7);
         switch(dia){
           case 1 :
                System.out.println("lunes"); 
                break;//ultima instruccion
                case 2 :
                System.out.println("martes"); 
                break;
                case 3 :
                System.out.println("miercoles"); 
                break;
                case 4 :
                System.out.println("jueves"); 
                break;
                case 5 :
                System.out.println("viernes"); 
                break;
                case 6 :
                System.out.println("sabado"); 
                break;
                case 7 :
                System.out.println("domingo"); 
                break;
                default://opcional/sin break/al final del switch
                    System.out.println("No es un dia valido(1-7)");
               
       }
        
    }
}
