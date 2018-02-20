
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=0;
        float sumaNota=0,nota;        
        int sino=1;
        Scanner leer=new Scanner (System.in);
        for(int i=1;sino==1;i++)
        {
            contador++;
            System.out.println("ingrese la nota del estudiante :");
            nota=leer.nextFloat();
            sumaNota=sumaNota+nota;
            System.out.println("ingrese 1 para continuar");
            sino=leer.nextInt();
        }
        System.out.println("el promedio del estudiante es :"+(sumaNota/contador));
        
        
        
    }
    
}
