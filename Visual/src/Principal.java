
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

    public class Principal {
    public static void main (String[] args){
         
        
        Scanner teclado = new Scanner(System.in);
      
      
        System.out.println("Dia:");
        Integer dd=teclado.nextInt();
        System.out.println("Mes:");
        Integer mm=teclado.nextInt();
        System.out.println("Año:");
        Integer aa=teclado.nextInt();
         
      
         
         Fecha f = new Fecha(dd,mm,aa);
          f.setDia(dd);
          f.setMes(mm);
          f.setAnio(aa);
          f.Aumentar();
        System.out.println(f);
    }
}


