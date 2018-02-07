
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

public class programa04 {
    public static void main (String[] arg){
        
        String name,ape;
        System.out.println("\t\t¿Cual es tu nomre?");
        Scanner scan = new Scanner(System.in);
       name = scan.nextLine();
       System.out.println("\t\t¿Cual es tu apellido?");
         ape = scan.nextLine();
          System.out.println("Hola\t" +name+ "\t" +ape);
    }
    
}
