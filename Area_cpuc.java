
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno38
 */
public class Area_cpuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
        
    for (int n = 1 ; n <=5; n++) {    
     System.out.println("Teclee la base");
     int base = scanner.nextInt();
     
     System.out.println("Teclee la altura");   
        
     int altura = scanner.nextInt();
     int area = base * altura;
     System.out.println("El area del rectangulo es " + area);
        
       }

        scanner.close(); 
     
     
    }
    
}

