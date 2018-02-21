package Tareas02;

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
        int op1, op2, op3;
      
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
        if(segundos<s){
            segundos += 60;
            op1=segundos-s;
           minutos--;
        }else{
            op1=segundos-s;
        }
        if(minutos<m){
            minutos += 60;
            op2=minutos-m;
            hora--;
        }else{
            op2=minutos-60;
        }
        
        op3=hora-h;
           System.out.println("\tHora de salida:");
           System.out.println(+op3+"h\t"+op2+"m\t"+op1+"s");
           
    }
}
