/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
        
      String usuario,contraseña;
       Scanner captu=new Scanner(System.in);
       do{
       System.out.println(" usuario");
       usuario=captu.nextLine();
       System.out.println(" contraseña");
       contraseña=captu.nextLine();
       }while(!(usuario.equals("admin")&& contraseña.equals("1234")));
        System.out.println("BIENVENIDO!!!");
    }
}
