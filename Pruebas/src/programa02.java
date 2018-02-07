
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josem
 */
public class programa02 {
     public static void main (String[] arg){
       int edad;
        System.out.println("\t\tHOLA PRRO");
        System.out.println("\t\t¿Cual es tu edad?");
        Scanner scan = new Scanner(System.in);
        edad = scan.nextInt();
        if(edad<18){
             System.out.println("\t\tEres un pichon");

        }else if(edad>=18 && edad<=26){
            System.out.println("\t\tEres bien chido");


        } else if(edad>26 && edad<=36){
             System.out.println("\t\t Eres un chavo ruco");

        } else if (edad>36 && edad<=50){
             System.out.println("\t\t estas bien señor@");

        }else if(edad>50){
            System.out.println("\t\t pinche viejito");
        }
     }
}
