package dizi.örnek.pkg2;
import java.util.Scanner;
public class DiziÖrnek2 {

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int n,toplam=0;
        
        System.out.println("Dizi boyutu gir!\n");
        n=girdi.nextInt();
        
        int[] dizi=new int[n];
        System.out.println("Sirayla dizi elemanlarini gir!\n");
        for(int i=0;i<dizi.length;i++)
        {
            dizi[i]=girdi.nextInt();
        }
        System.out.println("\nDizinin elemanlari:\n");
         System.out.println("indis\tdeger\n");
        for(int i=0;i<dizi.length;i++)
        {
            System.out.println(i+"\t"+dizi[i]);
        }
    }
    
}
