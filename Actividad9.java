/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // TODO code application logic here
        Funci miFun2 = new Funci();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        miFun2.crear();
      
        while (!salir) {
            System.out.println();
            System.out.println("1. mostrar la lista de domiciliarios por numero de ip");
            System.out.println("2. mostrar la lista de domiciliarios por UPZ");
            System.out.println("3. mostrar el total de domicilios a la semana");
            System.out.println("4. Salir");
            System.out.println();
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        miFun2.punto1();
                        break;
                    case 2:
                        miFun2.punto2();
                        break;
                    case 3:
                        miFun2.punto3();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
    
}
