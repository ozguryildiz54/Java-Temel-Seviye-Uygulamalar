/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantıksal.kapılar.operatörler;

/**
 *
 * @author ozgryldz54
 */
public class MantıksalKapılarOperatörler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      boolean x=true, y=false, z=true, t=false;
      
      //AND operatörü (&&)
      System.out.println("AND Operatörü");
      System.out.println("x&&y:"+(x&&y));
      System.out.println("t&&y:"+(t&&y));
      System.out.println("x&&t:"+(x&&t));
      System.out.println("x&&z:"+(x&&z));
      
      //OR operatörü (||)
      System.out.println("\nOR Operatörü");
      System.out.println("x||y:"+(x||y));
      System.out.println("t||y:"+(t||y));
      System.out.println("x||t:"+(x||t));
      System.out.println("x||z:"+(x||z));
      
      //XOR operatörü (^)
      System.out.println("\nXOR Operatörü");
      System.out.println("x^y:"+(x^y));
      System.out.println("t^y:"+(t^y));
      System.out.println("x^t:"+(x^t));
      System.out.println("x^z:"+(x^z));
      
      //NOT operatörü (!)
      System.out.println("\nNOT Operatörü");
      System.out.println("!x:"+(!x));
      System.out.println("!y:"+(!y));
      
    }
    
}
