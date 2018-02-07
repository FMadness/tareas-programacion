
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
public class programa03 {
    public static void main (String[] arg){
       int edad;
        System.out.println("\t\tHOLA PRRO");
        System.out.println("\t\t¿Cual es tu edad?");
        Scanner scan = new Scanner(System.in);
        edad = scan.nextInt();
        if (edad>18){
       System.out.println("\t\tEres mayor de edad");
        }
        else{
        System.out.println("\t\tEres menor de edad");
    }
    }
}
