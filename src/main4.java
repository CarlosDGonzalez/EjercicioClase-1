
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
public class main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int segundos,segundosIniciales;
    int minutos;
    int horas;
    int semanas;
    int dias;
    Scanner leer3=new Scanner (System.in);
     System.out.println("dame el numero de segundos :");
            segundos=leer3.nextInt();
            segundosIniciales=segundos;
            semanas=segundos/604800;
            segundos=segundos%604800;
            dias=segundos/86400;
            segundos=segundos%86400;
            horas=segundos/3600;
            segundos=segundos%3600;
            minutos=segundos/60;
            segundos=segundos%60;
            System.out.println("en :"+segundosIniciales +"segundos hay "+semanas+"semanas"+dias+"dias"+horas+"horas"+segundos+"segundos");
            
            
}
}
