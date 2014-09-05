/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcf;

import java.util.Scanner;

/**
 *
 * @author Casa
 */
public class Nuevo {
    private String entradaTeclado;
    Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
    
 /*   public void Nuevo(){
    	// Solicitar la implementacion deseada del Stack:
	//  1:   implementacion con HashSet
	//  2:   implementacion con TreeSet
        //  3:   implementacion con LinkedHashSet
    
    System.out.println ("Ingrese el set deseado: \n 1. HashSet \n 2. TreeSet \n 3. LinkedHashSet");
    entradaTeclado = entradaEscaner.nextLine(); //método sobre un objeto Scanner
    
     SetFactory sFactory = new SetFactory();
     sFactory.getSet(entradaTeclado);
    }
*/    
    public String set(){
        System.out.print("Ingrese el set deseado: \n 1. HashSet \n 2. TreeSet \n 3. LinkedHashSet");
        entradaTeclado = entradaEscaner.nextLine();
    return entradaTeclado;
    }
    
    public String tipo(){
        System.out.print("Ingrese Categoria: \n 1. Desarrolladro Java \n 2. Desarrollador Web \n 3. Desarrollador Celulares \n 4. Imprimir");
        entradaTeclado = entradaEscaner.nextLine();
    return entradaTeclado;
    }
    
    public String Java(){
        System.out.print("Ingrese Nombre para Desarrollador Java: ");
        entradaTeclado = entradaEscaner.nextLine();
    return entradaTeclado;
    }
    
    public String Web(){
        System.out.print("Ingrese Nombre para Desarrollador Web: ");
        entradaTeclado = entradaEscaner.nextLine();
    return entradaTeclado;
    }

    public String Cel(){
        System.out.print("Ingrese Nombre para Desarrollador Celulares: ");
        entradaTeclado = entradaEscaner.nextLine();
    return entradaTeclado;
    }
}