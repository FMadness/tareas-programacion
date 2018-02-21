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
public class programa08 {
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        int dias, horas, minutos,segundos,h,m,s;
        int contador=1;
        int op1=0,op2=0,op3=0;
          System.out.println("Cuantos dias trabajaste prro:");
         dias= scan.nextInt();
         
         while(contador<=dias){
             System.out.println("Horas de entrada  dia "+contador);
         horas = scan.nextInt();
          System.out.println("Minutos de entrada dia "+contador);
          minutos = scan.nextInt();
           System.out.println("Segundos de entrada dia "+contador);
           segundos = scan.nextInt();
            System.out.println("Horas de salida dia "+contador);
         h = scan.nextInt();
          System.out.println("Minutos de salida dia "+contador);
          m = scan.nextInt();
           System.out.println("Segundos de salida dia "+contador);
           s = scan.nextInt();
           if(segundos<s){
            segundos += 60;
            op1=s-segundos;
           minutos--;
        }else{
            op1=s-segundos;
        }
        if(minutos<m){
            minutos += 60;
            op2=m-minutos;
            horas--;
        }else{
            op2=minutos-60;
        }
        
        op3=h-horas;
            op1+=segundos;
         if(op1>=60){
               op1-=60;
               op2+=1;
              
           }
           op2+=minutos;
           if(op2>=60){
               op2-=60;
               op3+=1;
               
           }
         
           op3+=horas;
           contador++;
           
         }
         System.out.println("\tHoras trabajadas:");
           System.out.println(+op3+"h\t"+op2+"m\t"+op1+"s");
    }
}
