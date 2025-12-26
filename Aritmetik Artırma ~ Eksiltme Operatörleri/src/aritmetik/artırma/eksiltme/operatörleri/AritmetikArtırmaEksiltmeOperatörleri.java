/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetik.artırma.eksiltme.operatörleri;

/**
 *
 * @author ozgryldz54
 */
public class AritmetikArtırmaEksiltmeOperatörleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int a=54, b=2, c=45, d=5;
      a++;
      ++b;
      c--;
      --d;
      System.out.println("a:"+a+"\tb:"+b+"\tc:"+c+"\td:"+d);
      c=a++;
      b=++d;
      System.out.println("a:"+a+"\tb:"+b+"\tc:"+c+"\td:"+d);
      //b a'dan büyük değildir.
      System.out.println(a<b);
      c=a>b?d:a;
      System.out.println("c:"+c);
      int e=0b10;
      int f=a+e;
      int tcno=542_834;
      System.out.println(f);
      System.out.println(tcno);
      double g=0x2p1;
      double j=0x3p-3;
      System.out.println(g);
      System.out.println(j);
    }
    
}
