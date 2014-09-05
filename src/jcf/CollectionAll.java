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
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionAll {
    static Nuevo proyecto = new Nuevo();
    static String decision;
    static String comparador;
    static int salida=0;
//---------------------------------------------------------//

//---------------------------------------------------------//

//---------------------------------------------------------//   

    public static void main(String[] args) {
            decision = proyecto.set();
            if (decision.equals("1")){
                HashSet<String> java = new HashSet();
                HashSet<String> web = new HashSet();
                HashSet<String> celulares = new HashSet();                
                hash(java,web,celulares);       
            }else if(decision.equals("2")){
                SortedSet<String> java = new TreeSet();
                SortedSet<String> web = new TreeSet();
                SortedSet<String> celulares = new TreeSet();                
                tree(java,web,celulares);
            }else if(decision.equals("3")){
                LinkedHashSet<String> java = new LinkedHashSet();
                LinkedHashSet<String> web = new LinkedHashSet();
                LinkedHashSet<String> celulares = new LinkedHashSet(); 
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
        int contador=0;
        Iterator it = j.iterator();
        for(int i = 1; i<j.size();i++){
            it.hasNext();
            comparador = (String) it.next();
            if(w.contains(comparador)){
                contador =+ 1;
            }
        }
        if(contador == j.size()){
            System.out.println("El conjunto Java es un Subconjunto de Web");
        }else{
            System.out.println("El conjunto Java no es un Subconjunto de Web");
        }
    }

    static void mayor(Collection j,Collection w,Collection c){
        if((j.size())>(w.size())){
            if((w.size())>(c.size())){
                System.out.println("El conjunto con mas elementos es Java");
                traverse(j);
                //ordenar(j);
            }
            if((j.size())>(c.size())){
                System.out.println("El conjunto con mas elementos es Java");
                traverse(j);
                //ordenar(j);
            }else{
                System.out.println("El conjunto con mas elementos es Celulares");
                traverse(c);
                //ordenar(c);
            }
        }else if((w.size())>(c.size())){
            System.out.println("El conjunto con mas elementos es Web");
            traverse(w);
            //ordenar(w);
        }else{
            System.out.println("El conjunto con mas elementos es Celulares");
            traverse(c);
            //ordenar(c);
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
/*    static void ordenar(Collection coll) {
        String[] ordenado = new String[coll.size()];
        Iterator iter = coll.iterator();
        int k =-1;
        while (iter.hasNext()) {
          String elem = (String) iter.next();
          ordenado[k+1]=(elem);
        }

        for(int i = 0; i<ordenado.length; i++){ 
            for(int j = i; j<ordenado.length; j++){ 
                if(ordenado[i].compareTo(ordenado[j])>0){ 
                    String aux = ordenado[i]; 
                    ordenado[i] = ordenado[j]; 
                    ordenado[j] = aux; 
                } 
            } 
        }
        System.out.println("Elementos ordenados ascendentemente:");
        for(int i=0;i<ordenado.length;i++){
            System.out.print(ordenado[i]);
        }
    }*/
}