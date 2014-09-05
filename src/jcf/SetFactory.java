/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcf;

import java.util.*;


public class SetFactory {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory

    
 
  public static Set getSet(String entry)
  {
    if (entry.equals("1") )
    return new HashSet();
    else if (entry.equals("2") )
      return new TreeSet();
    else if (entry.equals("3") )
      return new LinkedHashSet();
 
    return null;
  }
}
