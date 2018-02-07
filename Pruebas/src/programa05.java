
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
public class programa05 {
    public static void main (String[] arg){
       int numero;
        System.out.println("\t\tHOLA PRRO");
        System.out.println("\t\tDame un numero entre 1 y 12");
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        if (numero==1 && numero ==3 && numero ==5&& numero==7 && numero ==9 &&numero ==11){
             System.out.println("\t\tEste mes tiene 30 dias");
        }else 
            if (numero!=2){
             System.out.println("\t\tEste mes tiene 31 dias");
        }
        if(numero==2){
             System.out.println("\t\tEste mes tiene 28 dias ");
        }
}
}
