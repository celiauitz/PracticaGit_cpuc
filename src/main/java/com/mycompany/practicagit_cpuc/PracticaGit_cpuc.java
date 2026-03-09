/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicagit_cpuc;

import java.util.Scanner;

/**
 *
 * @author Alumno38
 */
public class PracticaGit_cpuc {

    public static void main(String[] args) {
    System.out.println("--- Sistema de Gestión de Alumnos ---");     
     System.out.println("Bienvenido, Usuario Estudiante.");   
     Scanner cin = new Scanner (System.in);   
       
      int n1, n2, suma;
     
     
     System.out.print("introduce primer numero: ");
     n1= cin.nextInt(); 
     
     System.out.print("introduce segundo numero: ");
     n2 = cin.nextInt();
     
     suma = n1 + n2;
     
     
     System.out.println("El resultado es: " + suma);
    }
}
