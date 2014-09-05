//TreeSet: 0(log n) en orden alfabetico
//HashSet: 0(1) no los ordena
//LinkedHashSet: 0(1)   en orden como fueron agregados
//"a".compareTo(String    ):int-String

package jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionAll {
    static Nuevo proyecto = new Nuevo();
    static String decision;
    static String comparador;
    static int salida=0;
    static Scanner entradaEscaner = new Scanner (System.in);
//---------------------------------------------------------//

//---------------------------------------------------------//

//---------------------------------------------------------//   

    public static void main(String[] args) {
        SetFactory fact = new SetFactory();
        System.out.print("Ingrese el set deseado: \n 1. HashSet \n 2. TreeSet \n 3. LinkedHashSet");
        decision = entradaEscaner.nextLine();
        
        Set<String> java = fact.getSet (decision);
        Set<String> web = fact.getSet (decision);
        Set<String> celulares = fact.getSet (decision);
        if(decision.equals("1")){
            hash(java,web,celulares);
        }else if(decision.equals("2")){
            tree(java,web,celulares);        
        }else if(decision.equals("3")){
            linked(java,web,celulares);        
        }
    }

//------------------------------------------------------------//    
    static void hash(Set j,Set w,Set c){
        while(salida!=1){
            decision = proyecto.tipo();
            if(decision.equals("1")){
                j.add(proyecto.Java());
            }else if (decision.equals("2")){
                w.add(proyecto.Web());
            }else if (decision.equals("3")){
                c.add(proyecto.Cel());
            }else if(decision.equals("4")){
                imprimir(j,w,c);
                salida = 1;
            }
        }
    }
    
//------------------------------------------------------------//
    static void tree(Set j,Set w,Set c){
        while(salida!=1){
            decision = proyecto.tipo();
            if(decision.equals("1")){
                j.add(proyecto.Java());
            }else if (decision.equals("2")){
                w.add(proyecto.Web());
            }else if (decision.equals("3")){
                c.add(proyecto.Cel());
            }else if(decision.equals("4")){
                imprimir(j,w,c);
                salida = 1;
            }
        }
    }
    
//------------------------------------------------------------//
    static void linked(Set j,Set w,Set c){
        while(salida!=1){
            decision = proyecto.tipo();
            if(decision.equals("1")){
                j.add(proyecto.Java());
            }else if (decision.equals("2")){
                w.add(proyecto.Web());
            }else if (decision.equals("3")){
                c.add(proyecto.Cel());
            }else if(decision.equals("4")){
                imprimir(j,w,c);
                salida = 1;
            }
        }
    }

    static void imprimir(Set j,Set w,Set c){
        interseccion_JWC(j,w,c);
        solo_java(j,w,c);
        interseccion_WC(j,w,c);
        union_WC(j,w,c);
        subconjunto(j,w,c);
        mayor(j,w,c);
    }
    
    static void interseccion_JWC(Collection j,Collection w,Collection c){
        Iterator it = j.iterator();
        System.out.println("Desarrolladores con experiencia en Java, Web y Celulares:");
        while (it.hasNext()){
            comparador = (String) it.next();
            if(w.contains(comparador)){
                if(c.contains(comparador)){
                    System.out.print(comparador + ", ");
                }
            }
        }
        System.out.println();
    }
    
    static void solo_java(Collection j,Collection w,Collection c){
        Iterator it = j. iterator ();
        System.out.println("Desarrolladores con experiencia en Java pero no en Web:");
        while (it.hasNext()){
            comparador = (String) it.next();
            if(w.contains(comparador)){
            }else{
                System.out.print(comparador + ", ");            
            }
        }
        System.out.println();
    }

    static void interseccion_WC(Collection j,Collection w,Collection c){
        Iterator it = w.iterator();
        System.out.println("Desarrolladores con experiencia en Web y Celulares, pero no en Java:");
        while (it.hasNext()){
            comparador = (String) it.next();
            if(c.contains(comparador)){
                if(j.contains(comparador)){
                }else{
                    System.out.print(comparador + ", ");
                }
            }
        }
        System.out.println();
    }
    
    static void union_WC(Collection j,Collection w,Collection c){
        Iterator it = w.iterator();
        System.out.println("Desarrolladores con experiencia en Web o Celulares, pero no en Java:");
        while (it.hasNext()){
            comparador = (String) it.next();
            if(j.contains(comparador)){
            }else{
                System.out.print(comparador + " ");
            }
        }
        Iterator iter = c.iterator();
        while (iter.hasNext()){
            comparador = (String) iter.next();
            if(j.contains(comparador)){
            }else if(w.contains(comparador)){
            }else{
                System.out.print(comparador + " ");
            }
        }
        System.out.println();
    }
    
    static void subconjunto(Collection j,Collection w,Collection c){
        boolean sub;
        sub = w.containsAll(j);// devuelve un boleano 
        if (sub == true){
            System.out.println("El conjunto Java es un subconjunto del de Web");
        }else{
            System.out.println("El conjunto Java NO es un subconjunto del Web");
        }
    }

    static void mayor(Collection j,Collection w,Collection c){
        if((j.size())>(w.size())){
            if((w.size())>(c.size())){
                System.out.println("El conjunto con mas elementos es Java");
                traverse(j);
                ordenado(j);
            }
            if((j.size())>(c.size())){
                System.out.println("El conjunto con mas elementos es Java");
                traverse(j);
                ordenado(j);
            }else{
                System.out.println("El conjunto con mas elementos es Celulares");
                traverse(c);
                ordenado(c);
            }
        }else if((w.size())>(c.size())){
            System.out.println("El conjunto con mas elementos es Web");
            traverse(w);
            ordenado(w);
        }else{
            System.out.println("El conjunto con mas elementos es Celulares");
            traverse(c);
            ordenado(c);
        }
    }
    
    static void traverse(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
          String elem = (String) iter.next();
          System.out.print(elem + " ");
        }
        System.out.println();
  }
    static void ordenado(Collection orden){
        SortedSet ordenar = new TreeSet();
        Iterator iter = orden.iterator();
        while (iter.hasNext()) {
            ordenar.add((String) iter.next());
        }
        Iterator iter_ord = ordenar.iterator();
        System.out.println("Los elementos, ordenados de forma ascendente, del conjunto mayor son:");
        while (iter_ord.hasNext()) {
          String elem = (String) iter_ord.next();
          System.out.print(elem + " ");
        }
        System.out.println();
    }
}