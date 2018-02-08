/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas02;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Programa07 {
     public static void main (String[] arg){
         int dias;
          int horas, minutos, segundos;
          int op1 = 0,op2=0,op3=0;
          int h,m,s;
         System.out.println("Cuantos dias trabajaste prro:");
         Scanner scan = new Scanner(System.in);
         dias= scan.nextInt();
         for(int i=1; i<=dias ;i++){
            
             System.out.println("Cuantas horas trabajaste el dia:\t"+i);
              horas= scan.nextInt();
              op1=op1+horas;
             System.out.println("Cuantos minutos trabajaste el dia:\t"+i);
              minutos= scan.nextInt();
              op2=op2+minutos;
             System.out.println("Cuantos segundos trabajaste el dia:\t"+i);
              segundos = scan.nextInt();
              op3=op3+segundos;
     } 
         s=op3/60;
             
         }
         
             
             
         }
         
         
     }
