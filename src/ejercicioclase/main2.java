
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
public class main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        // TODO code application logic here
    
    int numero;
    int continuar=1;
    int sino=1;
    System.out.println("ingrese el numero del mes :");
            numero=leer.nextInt();
    for(int i=1;sino==1;i++)
        { 
    switch (numero)
    { 
    case 1:System.out.println("invierno :");
    break;  
    case 2:System.out.println("invierno :");
    break;
    case 3:System.out.println("invierno :");
    break;
    case 4:System.out.println("verano:");
    break; 
    case 5:System.out.println("verano:");
    break;  
    case 6:System.out.println("verano:");
    break;
    case 7:System.out.println("otoño :");
    break;
    case 8:System.out.println("otoño :");
    break; 
    case 9:System.out.println("otoño :");
    break;  
    case 10:System.out.println("primavera:");
    break;
    case 11:System.out.println("primavera:");
    break;
    case 12:System.out.println("primavera:");
    break; 
    default: 
        System.out.println("el numero no coresponde a un diadel mes:"); 
  }
            
            System.out.println("ingrese 1 para continuar");
            sino=leer.nextInt();
            System.out.println("ingrese el numero del mes :");
            numero=leer.nextInt();
            
        }
    
    
}
}
