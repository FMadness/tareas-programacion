package Tareas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Programa06 {
    public static void main (String[] arg){
        int hora, minutos, segundos;
        int h, m, s;
        int op1, op2, op3, op4, op5,op6;
        int resta1, resta2;
        System.out.println("Hora de entrada");
         Scanner scan = new Scanner(System.in);
         hora = scan.nextInt();
          System.out.println("Minutos de entrada");
          minutos = scan.nextInt();
           System.out.println("Segundos de entrada");
           segundos = scan.nextInt();
           
          System.out.println("Hora de salida");

         h = scan.nextInt();
          System.out.println("Minutos de salida");
          m = scan.nextInt();
           System.out.println("Segundos de salida");
           s = scan.nextInt();
           op1=h-hora;
           op2=m-minutos;
           op3=s-segundos;
            resta2=60-op3;
           if(op2<0){
           resta1=-1+op2;
           op4=60+resta1;
           }else {
               op4=60-op2;
           }
          
           if(op4<60){
               op5=op1+1;
              
           }else{
               op5=op1-1;
           }
           op6=(op5)*-1;
           System.out.println("\tHora de salida:");
           System.out.println(+op6+"h\t"+op4+"m\t"+resta2+"s");
           
    }
}
