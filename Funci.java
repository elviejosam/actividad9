/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class Funci {
    
    List<Domici> Domi = new ArrayList<>();
    
    int id2;
    String nombre2;
    int fecha2;
    String nacion2;
    int upz2;
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;
    int total;

    int num2;
    String descrip2;
    int fecha;
    int UPZ2;
    char confi2;
    
    public void crear(){
        
        System.out.println("en esta seccion se digitan los datos de los domiciliarios y reparto ");
        
        System.out.println("ingrese la cantidad de domiciliarios en la empresa");
        Scanner tam = new Scanner(System.in);
        int tam1 = tam.nextInt();
        
        for (int i = 0; i < tam1; i++) {
            
            Scanner id1 = new Scanner(System.in);
            Scanner nombre1 = new Scanner(System.in);
            Scanner nacion1 = new Scanner(System.in);
            Scanner upz1 = new Scanner(System.in);
            Scanner fecha1 = new Scanner(System.in);
            
            System.out.println("ingrese el id del domiciliario");
            id2 = id1.nextInt();
            System.out.println("ingrese el nombre del domiciliario");
            nombre2 = nombre1.nextLine();
            System.out.println("ingrese la fecha de nacimiento del domiciliario");
            fecha2 = fecha1.nextInt();
            System.out.println("ingrese la nacionalidad del domiciliario");
            nacion2 = nacion1.nextLine();
            System.out.println("ingrese la UPZ del domiciliario");
            upz2 = upz1.nextInt();
            
            
        }
        
        System.out.println("ingrese la cantidad de domiciliarios en la empresa");
        Scanner tam2 = new Scanner(System.in);
        int tam22 = tam.nextInt();
        
        for (int i = 0; i < tam22; i++) {
            
            Scanner num1 = new Scanner(System.in);
            Scanner descrip1 = new Scanner(System.in);
            Scanner fecha1 = new Scanner(System.in);
            Scanner UPZ1 = new Scanner(System.in);
            Scanner confi1 = new Scanner(System.in);
            
            System.out.println("ingrese el numero de reparto");
            num2 = num1.nextInt();
            System.out.println("ingrese la descripcion del reparto");
            descrip2 = descrip1.nextLine();
            System.out.println("ingrese la fecha de entrega");
            fecha = fecha1.nextInt();
            System.out.println("ingrese la UPZ del reparto");
            UPZ2 = UPZ1.nextInt();
            
        }
        
    }
    
}
