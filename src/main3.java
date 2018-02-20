import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese su edad para saber la categoria a la que pertenece");
        edad=leer.nextInt();
        
        if (edad >= 0 && edad <= 6){
          System.out.println("Tu categoria es pre-infantil");
        }else if (edad >= 7 && edad <= 17){
                  System.out.println("Tu categoria es infantil");
        }else if (edad >= 18 && edad <= 25){
                  System.out.println("Tu categoria es juvenil");
        }else if (edad >= 26 && edad <= 45){
                  System.out.println("Tu categoria es mayores");
        }else if (edad >= 60){
                  System.out.println("Tu categoria es veteranos");
        }
    }
    
}
